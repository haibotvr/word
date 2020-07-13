package com.simon.boot.word.service.word;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.WordSchool;
import com.simon.boot.word.qc.SchoolQC;

/**
 * @author simon.wei
 */
public interface WordSchoolService {

    ReturnValue add(WordSchool record) throws BusinessException;

    ReturnValue edit(WordSchool record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(SchoolQC qc) throws BusinessException;

}
