package com.simon.boot.word.service.word;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.WordUser;
import com.simon.boot.word.pojo.word.WordUserStudy;
import com.simon.boot.word.pojo.word.WordUserStudyLog;
import com.simon.boot.word.qc.StudyQC;

/**
 * @author simon.wei
 */
public interface WordUserStudyService {

    ReturnValue add(WordUserStudy record) throws BusinessException;

    ReturnValue findWords(Long id, Long userId) throws BusinessException;

    ReturnValue reStudy(Long id, Long userId) throws BusinessException;

    ReturnValue addLog(WordUserStudyLog record) throws BusinessException;

    ReturnValue findWordDetail(Long id) throws BusinessException;

    ReturnValue findByPage(StudyQC qc, WordUser wordUser) throws BusinessException;
}
