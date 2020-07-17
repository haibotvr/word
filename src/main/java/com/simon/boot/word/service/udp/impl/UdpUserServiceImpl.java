package com.simon.boot.word.service.udp.impl;

import com.simon.boot.word.dao.manual.udp.UdpUserDao;
import com.simon.boot.word.dao.udp.UdpUserMapper;
import com.simon.boot.word.dto.UserLoginDTO;
import com.simon.boot.word.eumn.BusinessExceptionMessage;
import com.simon.boot.word.eumn.UserStatus;
import com.simon.boot.word.eumn.YesOrNoEnum;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.kits.JsonUtil;
import com.simon.boot.word.framework.kits.JwtHelper;
import com.simon.boot.word.framework.kits.JwtTokenUtil;
import com.simon.boot.word.framework.kits.LeafConstant;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.oa.OaUser;
import com.simon.boot.word.pojo.oa.OaUserExample;
import com.simon.boot.word.pojo.udp.UdpUser;
import com.simon.boot.word.pojo.udp.UdpUserExample;
import com.simon.boot.word.service.udp.UdpUserService;
import com.simon.boot.word.vo.LoginVO;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author simon.wei
 */
@Slf4j
@Service
public class UdpUserServiceImpl implements UdpUserService {

    @Value("${jwt.udpHead}")
    private String tokenHead;

    @Autowired
    UdpUserMapper mapper;

    @Autowired
    UdpUserDao userDao;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    UserDetailsService userDetailsService;

    @Override
    public ReturnValue login(LoginVO vo) {
        log.info("请求参数:{}", JsonUtil.toString(vo));
        List<UdpUser> users = userDao.selectByLoginName(vo.getUsername());
        if(CollectionUtils.isEmpty(users)){
            throw new BusinessException(BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getValue(), BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getName());
        }
        //验证密码
        if(!passwordEncoder.matches(vo.getPassword(), users.get(0).getUserPassword())){
            throw new BusinessException(BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getValue(), BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getName());
        }
        UserLoginDTO dto = new UserLoginDTO();

        dto.setToken(jwtTokenUtil.generateToken(userDetailsService.loadUserByUsername(users.get(0).getId().toString().concat(LeafConstant.PROJECT_UDP))));

        dto.setTokenHead(tokenHead);

        log.info("返回数据:{}", JsonUtil.toString(dto));

        return ReturnValue.success().setData(dto).setMessage("登录成功");
    }

    @Override
    public ReturnValue add(UdpUser record) {
        //判断密码是否为空
        if(StringUtils.isBlank(record.getUserPassword())) {
            return ReturnValue.error().setMessage("密码不能为空");
        }
        //判断登陆方式为空
        if(StringUtils.isBlank(record.getEmail()) &&
                StringUtils.isBlank(record.getMobile()) &&
                StringUtils.isBlank(record.getUserName())) {
            return ReturnValue.error().setMessage("登陆方式不能为空");
        }
        //email是否重复
        if(StringUtils.isNotBlank(record.getEmail())) {
            UdpUserExample example = new UdpUserExample();
            UdpUserExample.Criteria criteria = example.createCriteria();
            criteria.andEmailEqualTo(record.getEmail());
            List<UdpUser> udpUsers = mapper.selectByExample(example);
            if(CollectionUtils.isNotEmpty(udpUsers)) {
                return ReturnValue.error().setMessage("邮箱已存在");
            }
        }
        //mobile是否重复
        if(StringUtils.isNotBlank(record.getMobile())) {
            UdpUserExample example = new UdpUserExample();
            UdpUserExample.Criteria criteria = example.createCriteria();
            criteria.andMobileEqualTo(record.getMobile());
            List<UdpUser> udpUsers = mapper.selectByExample(example);
            if(CollectionUtils.isNotEmpty(udpUsers)) {
                return ReturnValue.error().setMessage("手机号已存在");
            }
        }
        //username是否重复
        if(StringUtils.isNotBlank(record.getUserName())) {
            UdpUserExample example = new UdpUserExample();
            UdpUserExample.Criteria criteria = example.createCriteria();
            criteria.andUserNameEqualTo(record.getUserName());
            List<UdpUser> udpUsers = mapper.selectByExample(example);
            if(CollectionUtils.isNotEmpty(udpUsers)) {
                return ReturnValue.error().setMessage("用户名已存在");
            }
        }
        record.setUserPassword(passwordEncoder.encode(record.getUserPassword()));
        record.setUserStatus(YesOrNoEnum.YES.getValue());
        mapper.insert(record);
        return ReturnValue.success();
    }

    @Override
    public ReturnValue edit(UdpUser record) {
        mapper.updateByPrimaryKeySelective(record);
        return ReturnValue.success();
    }

    @Override
    public ReturnValue del(Long id) {
        mapper.deleteByPrimaryKey(id);
        return ReturnValue.success();
    }

    @Override
    public UdpUser findById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }
}
