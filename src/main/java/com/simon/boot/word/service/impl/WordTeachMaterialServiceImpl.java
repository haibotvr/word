package com.simon.boot.word.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.WordTeachMaterialMapper;
import com.simon.boot.word.eumn.TeachMaterialStatus;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.WordTeachMaterial;
import com.simon.boot.word.pojo.WordTeachMaterialExample;
import com.simon.boot.word.qc.PageQC;
import com.simon.boot.word.qc.TeachMaterialQC;
import com.simon.boot.word.service.WordTeachMaterialService;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author simon.wei
 */
@Service
public class WordTeachMaterialServiceImpl implements WordTeachMaterialService {

    @Autowired
    WordTeachMaterialMapper mapper;

    @Override
    public ReturnValue add(WordTeachMaterial record) throws BusinessException {
        record.setCreateTime(new Date());
        record.seteStatus(TeachMaterialStatus.AVAILABLE.getValue());
        return ReturnValue.success(mapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(WordTeachMaterial record) throws BusinessException {
        record.setUpdateTime(new Date());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        WordTeachMaterial record = new WordTeachMaterial();
        record.setId(id);
        record.seteStatus(TeachMaterialStatus.UNAVAILABLE.getValue());
        return ReturnValue.success(mapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue findByPage(TeachMaterialQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        WordTeachMaterialExample example = new WordTeachMaterialExample();
        if(StringUtils.isNotBlank(qc.getTmName())){
            WordTeachMaterialExample.Criteria criteria = example.createCriteria();
            criteria.andTmNameLike(qc.getTmName());
        }
        PageInfo<WordTeachMaterial> info = new PageInfo<>(mapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }
}
