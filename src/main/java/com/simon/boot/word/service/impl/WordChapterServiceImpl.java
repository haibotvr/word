package com.simon.boot.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.WordChapterMapper;
import com.simon.boot.word.entity.WordChapter;
import com.simon.boot.word.entity.WordChapterExample;
import com.simon.boot.word.eumn.ChapterStatus;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.WordChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author simon.wei
 */
@Service
public class WordChapterServiceImpl implements WordChapterService {

    @Autowired
    WordChapterMapper mapper;

    @Override
    public ReturnValue add(WordChapter record) throws BusinessException {
        record.setCreateTime(new Date());
        record.seteStatus(ChapterStatus.AVAILABLE.getValue());
        return ReturnValue.success(mapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(WordChapter record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        WordChapter record = new WordChapter();
        record.setId(id);
        record.seteStatus(ChapterStatus.UNAVAILABLE.getValue());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue findByPage(PageQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        WordChapterExample example = new WordChapterExample();
        WordChapterExample.Criteria criteria = example.createCriteria();
        criteria.andEStatusEqualTo(ChapterStatus.AVAILABLE.getValue());
        PageInfo<WordChapter> info = new PageInfo<>(mapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }
}
