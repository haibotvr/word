package com.simon.boot.word.service.word.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.word.WordUserMapper;
import com.simon.boot.word.dao.word.WordUserRoleRelationMapper;
import com.simon.boot.word.dao.manual.word.WordUserDao;
import com.simon.boot.word.dao.manual.word.WordUserRoleRelationDao;
import com.simon.boot.word.dto.UserLoginDTO;
import com.simon.boot.word.eumn.BusinessExceptionMessage;
import com.simon.boot.word.eumn.UserStatus;
import com.simon.boot.word.framework.annotation.BeanValid;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.kits.BeanProcessUtil;
import com.simon.boot.word.framework.kits.JwtTokenUtil;
import com.simon.boot.word.framework.kits.LeafConstant;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.WordUser;
import com.simon.boot.word.pojo.word.WordUserExample;
import com.simon.boot.word.pojo.word.WordUserRoleRelation;
import com.simon.boot.word.pojo.word.WordUserRoleRelationExample;
import com.simon.boot.word.qc.UserQC;
import com.simon.boot.word.service.word.WordUserService;
import com.simon.boot.word.vo.LoginVO;
import com.simon.boot.word.vo.WordUserCopyVO;
import com.simon.boot.word.vo.WordUserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @author simon.wei
 */
@Service
public class WordUserServiceImpl implements WordUserService {

    @Value("${jwt.tokenHead}")
    private String tokenHead;

    @Autowired
    WordUserMapper mapper;

    @Autowired
    WordUserDao dao;

    @Autowired
    WordUserRoleRelationDao userRoleRelationDao;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    UserDetailsService userDetailsService;

    @Autowired
    WordUserRoleRelationMapper userRoleRelationMapper;

    @Override
    @BeanValid
    public ReturnValue add(WordUserCopyVO record) throws BusinessException {
        WordUser user = new WordUser();
        BeanProcessUtil.copy(record, user);
        if(StringUtils.isEmpty(user.getLoginPassword())){
            return ReturnValue.error().setMessage("密码不能为空");
        }
        WordUserExample example = new WordUserExample();
        WordUserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(user.getLoginName());
        List<WordUser> wordUsers = mapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(wordUsers)){
            return ReturnValue.error().setMessage("用户名已存在");
        }
        user.setCreateTime(new Date());
        user.setLoginPassword(passwordEncoder.encode(record.getLoginPassword()));
        user.setEwStatus(UserStatus.AVAILABLE.getValue());
        user.setUserAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif");
        mapper.insertSelective(user);
        //添加角色
        addUserRoleRelation(record.getRoleIds(), user.getId());
        return ReturnValue.success();
    }

    private void addUserRoleRelation(List<Long> roleIds, Long userId){
        for (Long roleId : roleIds) {
            WordUserRoleRelation relation = new WordUserRoleRelation();
            relation.setUserId(userId);
            relation.setRoleId(roleId);
            userRoleRelationMapper.insert(relation);
        }
    }

    @Override
    public ReturnValue edit(WordUserCopyVO record) throws BusinessException {
        WordUser user = new WordUser();
        BeanProcessUtil.copy(record, user);
        record.setUpdateTime(new Date());
        mapper.updateByPrimaryKeySelective(user);
        //删除角色
        WordUserRoleRelationExample example = new WordUserRoleRelationExample();
        WordUserRoleRelationExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(record.getId());
        userRoleRelationMapper.deleteByExample(example);
        //重新添加角色
        addUserRoleRelation(record.getRoleIds(), record.getId());
        return ReturnValue.success().setMessage("更新成功");
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        WordUser record = new WordUser();
        record.setId(id);
        record.setEwStatus(UserStatus.UNAVAILABLE.getValue());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue findByPage(UserQC qc, WordUser user) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        List<WordUserCopyVO> users = dao.getWordUsers(qc);
        if(!CollectionUtils.isEmpty(users)){
            users.forEach(vo -> {
                StringBuffer roleName = new StringBuffer();
                for (String str : vo.getRoleNames()) {
                    roleName.append("-" + str);
                }
                if(roleName.length() > 1){
                    vo.setRoleName(roleName.toString().substring(1));
                }
            });
        }
        PageInfo<WordUserCopyVO> info = new PageInfo<>(users);
        return ReturnValue.success().setData(info);
    }

    @Override
    @BeanValid
    public ReturnValue login(LoginVO vo) throws BusinessException {
        WordUserExample example = new WordUserExample();
        WordUserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(vo.getUsername());
        List<WordUser> users = mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(users)){
            throw new BusinessException(BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getValue(), BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getName());
        }
        //验证密码
        if(!passwordEncoder.matches(vo.getPassword(), users.get(0).getLoginPassword())){
            throw new BusinessException(BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getValue(), BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getName());
        }
        if(users.get(0).getEwStatus().equals(UserStatus.UNAVAILABLE.getValue())){
            throw new BusinessException(BusinessExceptionMessage.ADMIN_USER_IS_NOT_USE.getValue(), BusinessExceptionMessage.ADMIN_USER_IS_NOT_USE.getName());
        }
        UserLoginDTO dto = new UserLoginDTO();
        dto.setToken(jwtTokenUtil.generateToken(userDetailsService.loadUserByUsername(users.get(0).getId().toString().concat(LeafConstant.PROJECT_WORD))));
        dto.setTokenHead(tokenHead);
        return ReturnValue.success().setData(dto).setMessage("登录成功");
    }

    @Override
    public ReturnValue info(String username) throws BusinessException {
        WordUserExample example = new WordUserExample();
        WordUserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(username);
        List<WordUser> users = mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(users)){
            return ReturnValue.error().setMessage("用户不存在");
        }
        WordUser user = users.get(0);
        WordUserVO vo = new WordUserVO();
        vo.setRealName(user.getRealName());
        vo.setUserAvatar(user.getUserAvatar());
        vo.setRoles(userRoleRelationDao.getRoles(user.getId()));
        return ReturnValue.success().setData(vo);
    }

    @Override
    public ReturnValue logout() throws BusinessException {
        return ReturnValue.success().setMessage("登出成功");
    }

    @Override
    public WordUser findByUsername(String username) throws BusinessException {
        WordUserExample example = new WordUserExample();
        WordUserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(username);
        List<WordUser> users = mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(users)){
            return null;
        }
        return users.get(0);
    }

    @Override
    public ReturnValue getPermissions(Long id) throws BusinessException {
        return ReturnValue.success().setData(userRoleRelationDao.getPermissions(id));
    }
}
