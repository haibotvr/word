package com.simon.boot.word.service;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.OaEmail;
import com.simon.boot.word.pojo.OaUser;
import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.qc.EmailQC;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.vo.EmailVO;
import com.simon.boot.word.vo.LoginVO;

/**
 * @author simon.wei
 */
public interface ExtraService {

    ReturnValue login(LoginVO vo) throws BusinessException;

    ReturnValue sendEmail(OaUser oaUser, EmailVO vo) throws BusinessException;

    ReturnValue delEmail(OaUser oaUser, EmailVO vo) throws BusinessException;

    ReturnValue findEmail(OaUser oaUser, OaEmail record) throws BusinessException;

    ReturnValue findEmailByPage(OaUser oaUser, EmailQC qc) throws BusinessException;

    ReturnValue saveDraft(OaUser oaUser, EmailVO vo) throws BusinessException;

    ReturnValue findUsers(OaUser oaUser) throws BusinessException;

    ReturnValue radicalDelEmail(OaUser oaUser, EmailVO vo) throws BusinessException;

    ReturnValue sendDraft(OaUser oaUser, EmailVO vo) throws BusinessException;
}
