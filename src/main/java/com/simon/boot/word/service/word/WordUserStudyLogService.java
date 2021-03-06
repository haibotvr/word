package com.simon.boot.word.service.word;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.WordUser;
import com.simon.boot.word.qc.StudyLogQC;

public interface WordUserStudyLogService {

    ReturnValue findByPage(StudyLogQC qc, WordUser user) throws BusinessException;

    ReturnValue findByChapter(Long id, WordUser user) throws BusinessException;
}
