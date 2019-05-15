package com.simon.boot.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.WordDetailMapper;
import com.simon.boot.word.entity.WordDetail;
import com.simon.boot.word.entity.WordDetailExample;
import com.simon.boot.word.eumn.DetailStatus;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.service.WordDetailService;
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

    @Override
    public ReturnValue add(WordDetail record) throws BusinessException {
        record.setCreateTime(new Date());
        record.seteStatus(DetailStatus.AVAILABLE.getValue());
        return ReturnValue.success(mapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(WordDetail record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        WordDetail record = new WordDetail();
        record.setId(id);
        record.seteStatus(DetailStatus.UNAVAILABLE.getValue());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue findByPage(PageQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        WordDetailExample example = new WordDetailExample();
        WordDetailExample.Criteria criteria = example.createCriteria();
        criteria.andEStatusEqualTo(DetailStatus.AVAILABLE.getValue());
        PageInfo<WordDetail> info = new PageInfo<>(mapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }
}
