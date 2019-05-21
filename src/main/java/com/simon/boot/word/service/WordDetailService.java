package com.simon.boot.word.service;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordDetail;
import com.simon.boot.word.qc.DetailQC;

/**
 * @author simon.wei
 */
public interface WordDetailService {

    ReturnValue add(WordDetail record) throws BusinessException;

    ReturnValue edit(WordDetail record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(DetailQC qc) throws BusinessException;

}
