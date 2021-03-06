package com.simon.boot.word.service.oa.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.oa.OaEmailMapper;
import com.simon.boot.word.dao.oa.OaUserMapper;
import com.simon.boot.word.dto.OaUserDTO;
import com.simon.boot.word.dto.UserLoginDTO;
import com.simon.boot.word.enums.*;
import com.simon.boot.word.framework.annotation.BeanValid;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.kits.JsonUtil;
import com.simon.boot.word.framework.kits.JwtTokenUtil;
import com.simon.boot.word.framework.kits.LeafConstant;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.oa.OaEmail;
import com.simon.boot.word.pojo.oa.OaEmailExample;
import com.simon.boot.word.pojo.oa.OaUser;
import com.simon.boot.word.pojo.oa.OaUserExample;
import com.simon.boot.word.qc.EmailQC;
import com.simon.boot.word.service.oa.ExtraService;
import com.simon.boot.word.vo.EmailVO;
import com.simon.boot.word.vo.LoginVO;
import io.micrometer.core.instrument.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author simon.wei
 */
@Service
public class ExtraServiceImpl implements ExtraService {

    private static Logger log = LoggerFactory.getLogger(ExtraServiceImpl.class);

    @Value("${jwt.oaHead}")
    private String tokenHead;

    @Autowired
    OaUserMapper mapper;

    @Autowired
    OaEmailMapper oaEmailMapper;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @Autowired
    UserDetailsService userDetailsService;

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
        dto.setToken(jwtTokenUtil.generateToken(userDetailsService.loadUserByUsername(users.get(0).getId().toString().concat(LeafConstant.PROJECT_OA))));
        dto.setTokenHead(tokenHead);
        log.info("返回数据:{}", JsonUtil.toString(dto));

        return ReturnValue.success().setData(dto).setMessage("登录成功");
    }

    @Override
    public ReturnValue sendEmail(OaUser oaUser, EmailVO vo) throws BusinessException {

        log.info("请求参数:{}", JsonUtil.toString(vo));

        if(StringUtils.isBlank(vo.getRecipientIds())){
            return ReturnValue.error().setMessage("请填写收件人");
        }

//        if(vo.getRecipientIds().endsWith(",")){
//            vo.setRecipientIds(vo.getRecipientIds() + oaUser.getId());
//        }else{
//            vo.setRecipientIds(vo.getRecipientIds() + "," + oaUser.getId());
//        }

        String[] recipientIds = vo.getRecipientIds().split(",");

        String recipientName = "";

        for (String recipientId : recipientIds) {

            OaEmail email = new OaEmail();
            email.setCreateTime(new Date());
            email.setIsCheck(CheckStatus.NO.getValue());
            email.setIsDraft(DraftStatus.NO.getValue());
            email.setOaStatus(EmailStatus.USE.getValue());
            email.setMailContent(vo.getMailContent());
            email.setMailTitle(vo.getMailTitle());
            email.setSenderId(oaUser.getId());
            email.setRecipientId(Long.valueOf(recipientId));
            email.setSenderName(oaUser.getRealName());
            OaUser recipient = mapper.selectByPrimaryKey(Long.valueOf(recipientId));
            if(recipient != null){
                email.setRecipientName(recipient.getRealName());
                recipientName += "," + recipient.getRealName();
            }

            oaEmailMapper.insertSelective(email);

        }

        //发送邮件到发件箱
        OaEmail ownMail = new OaEmail();
        ownMail.setCreateTime(new Date());
        ownMail.setIsCheck(CheckStatus.NO.getValue());
        ownMail.setIsDraft(DraftStatus.NO.getValue());
        ownMail.setOaStatus(EmailStatus.USE.getValue());
        ownMail.setMailContent(vo.getMailContent());
        ownMail.setMailTitle(vo.getMailTitle());
        ownMail.setSenderId(oaUser.getId());
        ownMail.setRecipientId(oaUser.getId());
        ownMail.setSenderName(oaUser.getRealName());
        ownMail.setRecipientName(recipientName.length() > 1 ? recipientName.substring(1) : recipientName);
        oaEmailMapper.insertSelective(ownMail);

        return ReturnValue.success().setMessage("发送成功");

    }

    @Override
    public ReturnValue saveDraft(OaUser oaUser, EmailVO vo) throws BusinessException {

        log.info("请求参数:{}", JsonUtil.toString(vo));

        OaEmail email = new OaEmail();
        email.setCreateTime(new Date());
        email.setIsCheck(CheckStatus.NO.getValue());
        email.setIsDraft(DraftStatus.YES.getValue());
        email.setOaStatus(EmailStatus.USE.getValue());
        email.setMailContent(vo.getMailContent());
        email.setMailTitle(vo.getMailTitle());
        email.setSenderId(oaUser.getId());
        email.setRecipientId(null);
        email.setSenderName(oaUser.getRealName());
        email.setRecipientIds(vo.getRecipientIds());

        oaEmailMapper.insertSelective(email);
        return ReturnValue.success().setMessage("保存成功");
    }

    @Override
    public ReturnValue delEmail(OaUser oaUser, EmailVO vo) throws BusinessException {

        log.info("请求参数:{}", JsonUtil.toString(vo));

        String[] ids = vo.getIds().split(",");

        for (String id : ids) {

            OaEmail email = new OaEmail();
            email.setId(Long.valueOf(id));
            email.setOaStatus(EmailStatus.DELETE.getValue());

            oaEmailMapper.updateByPrimaryKeySelective(email);
        }


        return ReturnValue.success().setMessage("删除成功");

    }

    @Override
    public ReturnValue findEmail(OaUser oaUser, OaEmail record) throws BusinessException {

        log.info("请求参数:{}", JsonUtil.toString(record));

        OaEmail email = new OaEmail();
        email.setId(record.getId());
        email.setIsCheck(CheckStatus.YES.getValue());
        oaEmailMapper.updateByPrimaryKeySelective(email);

        return ReturnValue.success().setData(oaEmailMapper.selectByPrimaryKey(record.getId()));
    }

    @Override
    public ReturnValue findEmailByPage(OaUser oaUser, EmailQC qc) throws BusinessException {

        log.info("请求参数:{}", JsonUtil.toString(qc));

        if(qc.getEmailType() == null){
            return ReturnValue.error().setMessage("分类错误");
        }
        if(qc.getPageNum() == null || qc.getPageSize() == null){
            return ReturnValue.error().setMessage("分类参数错误");
        }
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        OaEmailExample example = new OaEmailExample();
        example.setOrderByClause("create_time desc");
        OaEmailExample.Criteria criteria = example.createCriteria();
        // 分类 1：收件箱 2：已发送 3：草稿箱 4：已删除
        if(qc.getEmailType().equals(1)){
            criteria.andRecipientIdEqualTo(oaUser.getId());
            criteria.andSenderIdNotEqualTo(oaUser.getId());
            criteria.andIsDraftEqualTo(DraftStatus.NO.getValue());
            criteria.andOaStatusEqualTo(EmailStatus.USE.getValue());
        }else if(qc.getEmailType().equals(2)){
            criteria.andRecipientIdEqualTo(oaUser.getId());
            criteria.andSenderIdEqualTo(oaUser.getId());
            criteria.andIsDraftEqualTo(DraftStatus.NO.getValue());
            criteria.andOaStatusEqualTo(EmailStatus.USE.getValue());
        }else if(qc.getEmailType().equals(3)){
            criteria.andRecipientIdIsNull();
            criteria.andSenderIdEqualTo(oaUser.getId());
            criteria.andIsDraftEqualTo(DraftStatus.YES.getValue());
            criteria.andOaStatusEqualTo(EmailStatus.USE.getValue());
        }else if(qc.getEmailType().equals(4)){
            //收件箱已删除
            criteria.andRecipientIdEqualTo(oaUser.getId());
            criteria.andSenderIdNotEqualTo(oaUser.getId());
            criteria.andIsDraftEqualTo(DraftStatus.NO.getValue());
            criteria.andOaStatusEqualTo(EmailStatus.DELETE.getValue());
            //已发送已删除
            OaEmailExample.Criteria criteria2 = example.createCriteria();
            criteria2.andRecipientIdEqualTo(oaUser.getId());
            criteria2.andSenderIdEqualTo(oaUser.getId());
            criteria2.andIsDraftEqualTo(DraftStatus.NO.getValue());
            criteria2.andOaStatusEqualTo(EmailStatus.DELETE.getValue());
            example.or(criteria2);
            //草稿箱已删除
            OaEmailExample.Criteria criteria3 = example.createCriteria();
            criteria3.andRecipientIdIsNull();
            criteria3.andSenderIdEqualTo(oaUser.getId());
            criteria3.andIsDraftEqualTo(DraftStatus.YES.getValue());
            criteria3.andOaStatusEqualTo(EmailStatus.DELETE.getValue());
            example.or(criteria3);
        }else{
            return ReturnValue.error().setMessage("分类错误");
        }
        PageInfo<OaEmail> info = new PageInfo<>(oaEmailMapper.selectByExampleWithBLOBs(example));
        return ReturnValue.success().setData(info);
    }

    @Override
    public ReturnValue findUsers() {
        OaUserExample example = new OaUserExample();
        OaUserExample.Criteria criteria = example.createCriteria();
        criteria.andOaStatusEqualTo(UserStatus.AVAILABLE.getValue());
        List<OaUserDTO> dtos = new ArrayList<>();
        for (OaUser user : mapper.selectByExample(example)) {
            OaUserDTO dto = new OaUserDTO();
            dto.setId(user.getId());
            dto.setRealName(user.getRealName());
            dtos.add(dto);
        }
        return ReturnValue.success().setData(dtos);
    }

    @Override
    public ReturnValue radicalDelEmail(OaUser oaUser, EmailVO vo) throws BusinessException {
        log.info("请求参数:{}", JsonUtil.toString(vo));

        String[] ids = vo.getIds().split(",");

        for (String id : ids) {
            oaEmailMapper.deleteByPrimaryKey(Long.valueOf(id));
        }


        return ReturnValue.success().setMessage("删除成功");
    }

    @Override
    public ReturnValue sendDraft(OaUser oaUser, EmailVO vo) throws BusinessException {

        log.info("请求参数:{}", JsonUtil.toString(vo));

        OaEmail record = oaEmailMapper.selectByPrimaryKey(vo.getId());

        if(StringUtils.isBlank(record.getRecipientIds())){
            return ReturnValue.error().setMessage("没有收件人");
        }

        String[] recipientIds = vo.getRecipientIds().split(",");

        for (String recipientId : recipientIds) {

            OaEmail email = new OaEmail();
            email.setCreateTime(new Date());
            email.setIsCheck(CheckStatus.NO.getValue());
            email.setIsDraft(DraftStatus.NO.getValue());
            email.setOaStatus(EmailStatus.USE.getValue());
            email.setMailContent(vo.getMailContent());
            email.setMailTitle(vo.getMailTitle());
            email.setSenderId(oaUser.getId());
            email.setRecipientId(Long.valueOf(recipientId));
            email.setSenderName(oaUser.getRealName());
            OaUser recipient = mapper.selectByPrimaryKey(Long.valueOf(recipientId));
            if(recipient != null){
                email.setRecipientName(recipient.getRealName());
            }

            oaEmailMapper.insertSelective(email);

        }

        record.setOaStatus(EmailStatus.DELETE.getValue());
        oaEmailMapper.updateByPrimaryKeySelective(record);

        return ReturnValue.success().setMessage("发送成功");
    }

    @Override
    public OaUser findUserById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }
}