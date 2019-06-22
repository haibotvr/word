package com.simon.boot.word.service;

import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.qc.StudyLogQC;

public interface WordUserStudyLogService {

    ReturnValue findByPage(StudyLogQC qc, WordUser user) throws BusinessException;

}
