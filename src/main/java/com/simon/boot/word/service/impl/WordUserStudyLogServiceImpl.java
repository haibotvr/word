package com.simon.boot.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.WordUserStudyLogMapper;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordUser;
import com.simon.boot.word.pojo.WordUserStudyLog;
import com.simon.boot.word.pojo.WordUserStudyLogExample;
import com.simon.boot.word.qc.StudyLogQC;
import com.simon.boot.word.service.WordUserStudyLogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author simon.wei
 */
@Service
public class WordUserStudyLogServiceImpl implements WordUserStudyLogService {

    @Autowired
    WordUserStudyLogMapper mapper;

    @Override
    public ReturnValue findByPage(StudyLogQC qc, WordUser user) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        WordUserStudyLogExample example = new WordUserStudyLogExample();
        WordUserStudyLogExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(user.getId());
        example.setOrderByClause("create_time desc");
        PageInfo<WordUserStudyLog> info = new PageInfo<>(mapper.selectByExampleWithBLOBs(example));
        return ReturnValue.success().setData(info);
    }

    @Override
    public ReturnValue findByChapter(Long id, WordUser user) throws BusinessException {
        WordUserStudyLogExample example = new WordUserStudyLogExample();
        WordUserStudyLogExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(user.getId());
        criteria.andChapterIdEqualTo(id);
        example.setOrderByClause("create_time asc");
        return ReturnValue.success().setData(mapper.selectByExample(example));
    }
}
