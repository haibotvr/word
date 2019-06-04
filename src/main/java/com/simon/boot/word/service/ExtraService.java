package com.simon.boot.word.service;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.vo.LoginVO;

/**
 * @author simon.wei
 */
public interface ExtraService {

    ReturnValue login(LoginVO vo) throws BusinessException;

}
