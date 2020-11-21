package com.simon.boot.word.service.word.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.word.CallContactsMapper;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.CallContacts;
import com.simon.boot.word.pojo.word.CallContactsExample;
import com.simon.boot.word.qc.CallContactsQC;
import com.simon.boot.word.service.word.CallContactsService;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class CallContactsServiceImpl implements CallContactsService {

    private static Logger log = LoggerFactory.getLogger(CallContactsServiceImpl.class);

    @Autowired
    CallContactsMapper callContactsMapper;

    @Override
    public ReturnValue add(CallContacts record) throws BusinessException {
        record.setDataTime(new Date());
        return ReturnValue.success(callContactsMapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(CallContacts record) throws BusinessException {
        return ReturnValue.success(callContactsMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        return null;
    }

    @Override
    public ReturnValue findByPage(CallContactsQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());
        CallContactsExample example = new CallContactsExample();
        example.setOrderByClause("id desc");
        CallContactsExample.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(qc.getRealName())){
            criteria.andRealNameLike("%" + qc.getRealName() + "%");
        }
        if(StringUtils.isNotBlank(qc.getRealSex())) {
            criteria.andRealSexEqualTo(qc.getRealSex());
        }
        if(StringUtils.isNotBlank(qc.getIndustryDetail())){
            criteria.andIndustryDetailLike("%" + qc.getIndustryDetail() + "%");
        }
        if(StringUtils.isNotBlank(qc.getDataFrom())){
            criteria.andDataFromLike("%" + qc.getDataFrom() + "%");
        }
        if(StringUtils.isNotBlank(qc.getFromPerson())){
            criteria.andFromPersonLike("%" + qc.getFromPerson() + "%");
        }
        if(StringUtils.isNotBlank(qc.getDataStatus())){
            criteria.andDataStatusLike("%" + qc.getDataStatus() + "%");
        }
        if(StringUtils.isNotBlank(qc.getRemark())){
            criteria.andRemarkLike("%" + qc.getRemark() + "%");
        }
        if(StringUtils.isNotBlank(qc.getJob())){
            criteria.andJobLike("%" + qc.getJob() + "%");
        }
        if(StringUtils.isNotBlank(qc.getJobCategory())){
            criteria.andJobCategoryLike("%" + qc.getJobCategory() + "%");
        }
        if(StringUtils.isNotBlank(qc.getPhone())){
            criteria.andPhoneEqualTo(qc.getPhone());
        }
        if(StringUtils.isNotBlank(qc.getPhone2())){
            criteria.andPhone2EqualTo(qc.getPhone2());
        }
        if(StringUtils.isNotBlank(qc.getCompanyName())){
            criteria.andCompanyNameLike("%" + qc.getCompanyName() + "%");
        }
        if(StringUtils.isNotBlank(qc.getKeywords())){
            criteria.andKeywordsLike("%" + qc.getKeywords() + "%");
        }
        if(StringUtils.isNotBlank(qc.getProvince())){
            criteria.andProvinceLike("%" + qc.getProvince() + "%");
        }
        if(StringUtils.isNotBlank(qc.getCity())){
            criteria.andCityLike("%" + qc.getCity() + "%");
        }
        if(StringUtils.isNotBlank(qc.getIndustry())){
            criteria.andIndustryLike("%" + qc.getIndustry() + "%");
        }
        if(StringUtils.isNotBlank(qc.getIndustryNew())){
            criteria.andIndustryNewLike("%" + qc.getIndustryNew() + "%");
        }
        PageInfo<CallContacts> info = new PageInfo<>(callContactsMapper.selectByExample(example));
        return ReturnValue.success().setData(info);
    }
}
