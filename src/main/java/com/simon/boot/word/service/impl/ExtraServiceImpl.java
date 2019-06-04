package com.simon.boot.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.OaUserMapper;
import com.simon.boot.word.dao.WordUserMapper;
import com.simon.boot.word.dto.UserLoginDTO;
import com.simon.boot.word.eumn.BusinessExceptionMessage;
import com.simon.boot.word.eumn.UserStatus;
import com.simon.boot.word.framework.annotation.BeanValid;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.kits.JwtHelper;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.OaUser;
import com.simon.boot.word.pojo.OaUserExample;
import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.pojo.WordUserExample;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.ExtraService;
import com.simon.boot.word.service.WordUserService;
import com.simon.boot.word.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.Date;
import java.util.List;

/**
 * @author simon.wei
 */
@Service
public class ExtraServiceImpl implements ExtraService {

    @Autowired
    OaUserMapper mapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    @BeanValid
    public ReturnValue login(LoginVO vo) throws BusinessException {
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
        return ReturnValue.success().setData(dto).setMessage("登录成功");
    }

}
