package com.simon.boot.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.WordChapterMapper;
import com.simon.boot.word.dao.WordDetailMapper;
import com.simon.boot.word.dao.WordTeachMaterialMapper;
import com.simon.boot.word.eumn.DetailStatus;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordChapter;
import com.simon.boot.word.pojo.WordDetail;
import com.simon.boot.word.pojo.WordDetailExample;
import com.simon.boot.word.pojo.WordTeachMaterial;
import com.simon.boot.word.qc.DetailQC;
import com.simon.boot.word.service.WordDetailService;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author simon.wei
 */
@Service
public class WordDetailServiceImpl implements WordDetailService {

    @Autowired
    WordDetailMapper mapper;

    @Autowired
    WordChapterMapper chapterMapper;

    @Override
    public ReturnValue add(WordDetail record) throws BusinessException {
        record.setCreateTime(new Date());
        record.setEwStatus(DetailStatus.AVAILABLE.getValue());
        if(record.getChapterId() != null){
            WordChapter chapter = chapterMapper.selectByPrimaryKey(record.getChapterId());
            if(chapter != null){
                record.setTmId(chapter.getTmId());
            }
        }
        return ReturnValue.success(mapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(WordDetail record) throws BusinessException {
        record.setUpdateTime(new Date());
//        if(record.getChapterId() != null){
//            WordChapter chapter = chapterMapper.selectByPrimaryKey(record.getChapterId());
//            if(chapter != null){
//                record.setTmId(chapter.getTmId());
//            }
//        }
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        WordDetail record = new WordDetail();
        record.setId(id);
        record.setEwStatus(DetailStatus.UNAVAILABLE.getValue());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue findByPage(DetailQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        WordDetailExample example = new WordDetailExample();
        WordDetailExample.Criteria criteria = example.createCriteria();
        criteria.andChapterIdEqualTo(qc.getChapterId());
        criteria.andEwStatusEqualTo(DetailStatus.AVAILABLE.getValue());
        if(StringUtils.isNotBlank(qc.getWordEn())){
            criteria.andWordEnLike("%" + qc.getWordEn() + "%");
        }
        PageInfo<WordDetail> info = new PageInfo<>(mapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }

}
