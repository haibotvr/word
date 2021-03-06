package com.simon.boot.word.service.word;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.WordUser;
import com.simon.boot.word.qc.UserQC;
import com.simon.boot.word.vo.LoginVO;
import com.simon.boot.word.vo.WordUserCopyVO;

/**
 * @author simon.wei
 */
public interface WordUserService {

    ReturnValue add(WordUserCopyVO record) throws BusinessException;

    ReturnValue edit(WordUserCopyVO record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(UserQC qc, WordUser user) throws BusinessException;

    ReturnValue login(LoginVO vo) throws BusinessException;

    ReturnValue info(String username) throws BusinessException;

    ReturnValue logout() throws BusinessException;

    ReturnValue getPermissions(Long id) throws BusinessException;

    WordUser findByUsername(String username) throws BusinessException;

    WordUser findById(Long id) throws BusinessException;
}
