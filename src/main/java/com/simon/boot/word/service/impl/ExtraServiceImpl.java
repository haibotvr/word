package com.simon.boot.word.service.impl;

import com.simon.boot.word.dao.OaEmailMapper;
import com.simon.boot.word.dao.OaUserMapper;
import com.simon.boot.word.dto.UserLoginDTO;
import com.simon.boot.word.eumn.BusinessExceptionMessage;
import com.simon.boot.word.eumn.CheckStatus;
import com.simon.boot.word.eumn.EmailStatus;
import com.simon.boot.word.eumn.UserStatus;
import com.simon.boot.word.framework.annotation.BeanValid;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.kits.JsonUtil;
import com.simon.boot.word.framework.kits.JwtHelper;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.*;
import com.simon.boot.word.service.ExtraService;
import com.simon.boot.word.vo.EmailVO;
import com.simon.boot.word.vo.LoginVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private static Logger log = LoggerFactory.getLogger(ExtraServiceImpl.class);

    @Autowired
    OaUserMapper mapper;

    @Autowired
    OaEmailMapper oaEmailMapper;

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

    @Override
    public ReturnValue sendEmail(OaUser oaUser, EmailVO vo) throws BusinessException {

        log.info("请求参数:{}", JsonUtil.toString(vo));

        if(vo.getRecipientIds().endsWith(",")){
            vo.setRecipientIds(vo.getRecipientIds() + oaUser.getId());
        }else{
            vo.setRecipientIds(vo.getRecipientIds() + "," + oaUser.getId());
        }

        String[] recipientIds = vo.getRecipientIds().split(",");

        for (String recipientId : recipientIds) {

            OaEmail email = new OaEmail();
            email.setCreateTime(new Date());
            email.setIsCheck(CheckStatus.NO.getValue());
            email.setOaStatus(EmailStatus.USE.getValue());
            email.setMailContent(vo.getMailContent());
            email.setMailTitle(vo.getMailTitle());
            email.setSenderId(oaUser.getId());
            email.setRecipientId(Long.valueOf(recipientId));
            email.setSenderName(oaUser.getRealName());

            oaEmailMapper.insertSelective(email);

        }

        return ReturnValue.success().setMessage("发送成功");

    }

    @Override
    public ReturnValue delEmail(OaUser oaUser, OaEmail record) throws BusinessException {

        log.info("请求参数:{}", JsonUtil.toString(record));

        record.setOaStatus(EmailStatus.DELETE.getValue());

        oaEmailMapper.updateByPrimaryKeySelective(record);

        return ReturnValue.success().setMessage("删除成功");

    }

    @Override
    public ReturnValue findEmail(OaUser oaUser, OaEmail record) throws BusinessException {

        log.info("请求参数:{}", JsonUtil.toString(record));

        OaEmailExample example = new OaEmailExample();
        OaEmailExample.Criteria criteria = example.createCriteria();
        criteria.andOaStatusEqualTo(record.getOaStatus());
        if(record.getId() != null){
            criteria.andIdEqualTo(record.getId());
        }

        return ReturnValue.success().setData(oaEmailMapper.selectByExample(example));
    }

    @Override
    public ReturnValue findEmailByPage(OaUser oaUser, OaEmail record) throws BusinessException {

        log.info("请求参数:{}", JsonUtil.toString(record));

        return null;
    }
}
