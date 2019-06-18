package com.simon.boot.word.service;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordUserStudy;
import com.simon.boot.word.pojo.WordUserStudyLog;

/**
 * @author simon.wei
 */
public interface WordUserStudyService {

    ReturnValue add(WordUserStudy record) throws BusinessException;

    ReturnValue findWords(Long id, Long userId) throws BusinessException;

    ReturnValue reStudy(Long id, Long userId) throws BusinessException;

    ReturnValue addLog(WordUserStudyLog record) throws BusinessException;
}
