package com.simon.boot.word.service.impl;

import com.simon.boot.word.dao.OaUserMapper;
import com.simon.boot.word.dto.UserLoginDTO;
import com.simon.boot.word.eumn.BusinessExceptionMessage;
import com.simon.boot.word.eumn.UserStatus;
import com.simon.boot.word.framework.annotation.BeanValid;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.kits.JsonUtil;
import com.simon.boot.word.framework.kits.JwtHelper;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.OaUser;
import com.simon.boot.word.pojo.OaUserExample;
import com.simon.boot.word.service.ExtraService;
import com.simon.boot.word.vo.LoginVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @author simon.wei
 */
@Service
public class ExtraServiceImpl implements ExtraService {

    private static Logger log = LoggerFactory.getLogger(ExtraServiceImpl.class);

    @Autowired
    OaUserMapper mapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    @BeanValid
    public ReturnValue login(LoginVO vo) throws BusinessException {

        log.info("请求参数:{}", JsonUtil.toString(vo));

        OaUserExample example = new OaUserExample();
        OaUserExample.Criteria criteria = example.createCriteria();
        criteria.andLoginNameEqualTo(vo.getUsername());
        List<OaUser> users = mapper.selectByExample(example);
        if(CollectionUtils.isEmpty(users)){
            throw new BusinessException(BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getValue(), BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getName());
        }
        //验证密码
        if(!users.get(0).getLoginPassword().equals(vo.getPassword())){
            throw new BusinessException(BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getValue(), BusinessExceptionMessage.LOGIN_NAME_OR_PASSWORD_FAULT.getName());
        }
        if(users.get(0).getOaStatus().equals(UserStatus.UNAVAILABLE.getValue())){
            throw new BusinessException(BusinessExceptionMessage.ADMIN_USER_IS_NOT_USE.getValue(), BusinessExceptionMessage.ADMIN_USER_IS_NOT_USE.getName());
        }
        UserLoginDTO dto = new UserLoginDTO();
        dto.setToken(JwtHelper.createJWT(users.get(0)));

        log.info("返回数据:{}", JsonUtil.toString(dto));

        return ReturnValue.success().setData(dto).setMessage("登录成功");
    }

}
