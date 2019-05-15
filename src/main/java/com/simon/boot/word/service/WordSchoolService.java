package com.simon.boot.word.service;

import com.simon.boot.word.pojo.WordSchool;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.qc.PageQC;

/**
 * @author simon.wei
 */
public interface WordSchoolService {

    ReturnValue add(WordSchool record) throws BusinessException;

    ReturnValue edit(WordSchool record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(PageQC qc) throws BusinessException;

}
