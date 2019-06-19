package com.simon.boot.word.service;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.qc.UserQC;
import com.simon.boot.word.vo.LoginVO;

/**
 * @author simon.wei
 */
public interface WordUserService {

    ReturnValue add(WordUser record) throws BusinessException;

    ReturnValue edit(WordUser record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(UserQC qc, WordUser user) throws BusinessException;

    ReturnValue login(LoginVO vo) throws BusinessException;

    ReturnValue info(String token) throws BusinessException;

    ReturnValue logout() throws BusinessException;
}
