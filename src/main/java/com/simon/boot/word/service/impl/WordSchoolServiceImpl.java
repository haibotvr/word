package com.simon.boot.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.WordSchoolMapper;
import com.simon.boot.word.pojo.WordSchool;
import com.simon.boot.word.pojo.WordSchoolExample;
import com.simon.boot.word.eumn.SchoolStatus;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.WordSchoolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author simon.wei
 */
@Service
public class WordSchoolServiceImpl implements WordSchoolService {

    @Autowired
    WordSchoolMapper mapper;

    @Override
    public ReturnValue add(WordSchool record) throws BusinessException {
        record.setCreateTime(new Date());
        record.seteStatus(SchoolStatus.AVAILABLE.getValue());
        return ReturnValue.success(mapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(WordSchool record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        WordSchool record = new WordSchool();
        record.setId(id);
        record.seteStatus(SchoolStatus.UNAVAILABLE.getValue());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue findByPage(PageQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        WordSchoolExample example = new WordSchoolExample();
        WordSchoolExample.Criteria criteria = example.createCriteria();
        criteria.andEStatusEqualTo(SchoolStatus.AVAILABLE.getValue());
        PageInfo<WordSchool> info = new PageInfo<>(mapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }
}
