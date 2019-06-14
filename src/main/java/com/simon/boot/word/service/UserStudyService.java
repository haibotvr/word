package com.simon.boot.word.service;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.UserStudyLog;
import com.simon.boot.word.pojo.WordUserStudy;

/**
 * @author simon.wei
 */
public interface UserStudyService {

    ReturnValue add(WordUserStudy record) throws BusinessException;

    ReturnValue findWords(Long id, Long userId) throws BusinessException;

    ReturnValue reStudy(Long id, Long userId) throws BusinessException;
}
