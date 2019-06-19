package com.simon.boot.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.WordUserMapper;
import com.simon.boot.word.dto.UserLoginDTO;
import com.simon.boot.word.eumn.BusinessExceptionMessage;
import com.simon.boot.word.eumn.UserStatus;
import com.simon.boot.word.framework.annotation.BeanValid;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.kits.JwtHelper;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.pojo.WordUserExample;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.qc.UserQC;
import com.simon.boot.word.service.WordUserService;
import com.simon.boot.word.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    WordUserMapper mapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    @BeanValid
    public ReturnValue add(WordUser record) throws BusinessException {
        if(StringUtils.isEmpty(record.getLoginPassword())){
            return ReturnValue.error().setMessage("密码不能为空");
        }
        WordUserExample example = new WordUserExample();
        WordUserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(record.getLoginName());
        List<WordUser> wordUsers = mapper.selectByExample(example);
        if(!CollectionUtils.isEmpty(wordUsers)){
            return ReturnValue.error().setMessage("用户名已存在");
        }
        record.setCreateTime(new Date());
        record.setLoginPassword(passwordEncoder.encode(record.getLoginPassword()));
        record.setEwStatus(UserStatus.AVAILABLE.getValue());
        return ReturnValue.success(mapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(WordUser record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
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
        WordUserExample example = new WordUserExample();
        WordUserExample.Criteria criteria = example.createCriteria();
        criteria.andEwStatusEqualTo(UserStatus.AVAILABLE.getValue());
        criteria.andSchoolIdEqualTo(qc.getSchoolId());
        if(!StringUtils.isEmpty(qc.getRealName())){
            criteria.andRealNameLike("%" + qc.getRealName() + "%");
        }
        PageInfo<WordUser> info = new PageInfo<>(mapper.selectByExample(example));
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
        dto.setToken(JwtHelper.createJWT(users.get(0)));
        return ReturnValue.success().setData(dto).setMessage("登录成功");
    }

    @Override
    public ReturnValue info(String token) throws BusinessException {
        return ReturnValue.success().setData(JwtHelper.parseJWT(token));
    }

    @Override
    public ReturnValue logout() throws BusinessException {
        return ReturnValue.success().setMessage("登出成功");
    }
}
