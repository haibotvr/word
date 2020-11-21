package com.simon.boot.word.service.word;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.CallContacts;
import com.simon.boot.word.pojo.word.WordSchool;
import com.simon.boot.word.qc.CallContactsQC;
import com.simon.boot.word.qc.SchoolQC;

/**
 * @author simon.wei
 */
public interface CallContactsService {

    ReturnValue add(CallContacts record) throws BusinessException;

    ReturnValue edit(CallContacts record) throws BusinessException;

    ReturnValue del(Long id) throws BusinessException;

    ReturnValue findByPage(CallContactsQC qc) throws BusinessException;

}
