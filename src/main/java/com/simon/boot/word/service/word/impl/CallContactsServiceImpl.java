package com.simon.boot.word.service.word.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.simon.boot.word.dao.word.CallContactsMapper;
import com.simon.boot.word.framework.exception.BusinessException;
import com.simon.boot.word.framework.kits.ExcelUtils;
import com.simon.boot.word.framework.kits.LeafConstant;
import com.simon.boot.word.framework.web.ReturnValue;
import com.simon.boot.word.pojo.word.CallContacts;
import com.simon.boot.word.pojo.word.CallContactsExample;
import com.simon.boot.word.qc.CallContactsQC;
import com.simon.boot.word.service.word.CallContactsService;
import com.simon.boot.word.vo.CompanyNameExcelVO;
import com.simon.boot.word.vo.ContactExcelVO;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
public class CallContactsServiceImpl implements CallContactsService {

    private static Logger log = LoggerFactory.getLogger(CallContactsServiceImpl.class);

    @Autowired
    CallContactsMapper callContactsMapper;

    @Override
    public ReturnValue add(CallContacts record) throws BusinessException {
        record.setDataTime(DateFormatUtils.format(new Date(), LeafConstant.DATETIME_FORMAT));
        record.setUpdateTime(DateFormatUtils.format(new Date(), LeafConstant.DATETIME_FORMAT));
        return ReturnValue.success(callContactsMapper.insertSelective(record));
    }

    @Override
    public ReturnValue edit(CallContacts record) throws BusinessException {
        record.setUpdateTime(DateFormatUtils.format(new Date(), LeafConstant.DATETIME_FORMAT));
        return ReturnValue.success(callContactsMapper.updateByPrimaryKeySelective(record));
    }

    @Override
    public ReturnValue del(Long id) throws BusinessException {
        return null;
    }

    @Override
    public ReturnValue findByPage(CallContactsQC qc) throws BusinessException {
        PageHelper.startPage(qc.getPageNum(), qc.getPageSize());

        PageInfo<CallContacts> info = new PageInfo<>(this.selectContactList(qc));
        return ReturnValue.success().setData(info);
    }

    @Override
    public ReturnValue exportContacts(CallContactsQC qc) throws BusinessException {
        return ReturnValue.success(this.selectContactList(qc));
    }

    @Override
    public ReturnValue exportTargetContacts(MultipartFile file) throws BusinessException {
        long t1 = System.currentTimeMillis();
        List<CompanyNameExcelVO> contactVOS = ExcelUtils.readExcel("", CompanyNameExcelVO.class, file);
        long t2 = System.currentTimeMillis();
        log.info(String.format("read over! cost:%sms", (t2 - t1)));
        if(CollectionUtils.isEmpty(contactVOS)) {
            return ReturnValue.error().setMessage("没有数据");
        }
        if(contactVOS.size() > LeafConstant.RECORDS_1000) {
            return ReturnValue.error().setMessage("Excel中大于1000条数据");
        }
        CallContactsExample example = new CallContactsExample();
        CallContactsExample.Criteria criteria = example.createCriteria();
        List<String> collect = contactVOS.stream().map(CompanyNameExcelVO::getCompanyName).collect(Collectors.toList());
        criteria.andCompanyNameIn(collect);
        List<CallContacts> callContacts = callContactsMapper.selectByExample(example);
        if(CollectionUtils.isEmpty(callContacts)) {
            return ReturnValue.error().setMessage("没有数据");
        }
        return ReturnValue.success(callContacts);
    }

    @Override
    public ReturnValue importContacts(MultipartFile file) throws BusinessException {
        long t1 = System.currentTimeMillis();
        List<ContactExcelVO> contactVOS = ExcelUtils.readExcel("", ContactExcelVO.class, file);
        long t2 = System.currentTimeMillis();
        log.info(String.format("read over! cost:%sms", (t2 - t1)));
        if(CollectionUtils.isEmpty(contactVOS)) {
            return ReturnValue.error().setMessage("Excel中未获取到数据");
        }
        if(contactVOS.size() > LeafConstant.RECORDS_1000) {
            return ReturnValue.error().setMessage("Excel中大于1000条数据");
        }
        for (ContactExcelVO contactVO : contactVOS) {
            List<CallContacts> callContacts = this.selectContacts(contactVO);
            CallContacts record = new CallContacts();
            BeanUtils.copyProperties(contactVO, record);
            if(CollectionUtils.isEmpty(callContacts)) {
                //新增
                if(StringUtils.isBlank(record.getDataTime())) {
                    record.setDataTime(DateFormatUtils.format(new Date(), LeafConstant.DATETIME_FORMAT));
                }
                if(StringUtils.isBlank(record.getUpdateTime())) {
                    record.setUpdateTime(DateFormatUtils.format(new Date(), LeafConstant.DATETIME_FORMAT));
                }
                callContactsMapper.insertSelective(record);
            } else {
                //更新
                record.setId(callContacts.get(0).getId());
                if(StringUtils.isBlank(record.getUpdateTime())) {
                    record.setUpdateTime(DateFormatUtils.format(new Date(), LeafConstant.DATETIME_FORMAT));
                }
                callContactsMapper.updateByPrimaryKeySelective(record);
            }
        }
        long t3 = System.currentTimeMillis();
        log.info(String.format("process over! cost:%sms", (t3 - t2)));
        return ReturnValue.success();
    }

    /**
     * 查询联系人数据
     *
     * @param record 公司名 联系电话
     */
    private List<CallContacts> selectContacts(ContactExcelVO record) {
        CallContactsExample example = new CallContactsExample();
        CallContactsExample.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(record.getPhone())){
            criteria.andPhoneEqualTo(record.getPhone().trim());
        } else {
            return new ArrayList<>();
        }
        if(StringUtils.isNotBlank(record.getCompanyName())){
            criteria.andCompanyNameEqualTo(record.getCompanyName().trim());
        } else {
            return new ArrayList<>();
        }
        return callContactsMapper.selectByExample(example);
    }

    /**
     * 条件查询联系人数据
     */
    private List<CallContacts> selectContactList(CallContactsQC qc) {
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
        if(StringUtils.isNotBlank(qc.getIndustryAi())){
            criteria.andIndustryAiLike("%" + qc.getIndustryAi() + "%");
        }
        if(StringUtils.isNotBlank(qc.getOfficeEmail())){
            criteria.andOfficeEmailLike("%" + qc.getOfficeEmail() + "%");
        }
        if(StringUtils.isNotBlank(qc.getDepartment())){
            criteria.andDepartmentLike("%" + qc.getDepartment() + "%");
        }
        if(Objects.nonNull(qc.getPcNumber())){
            criteria.andPcNumberGreaterThan(qc.getPcNumber());
        }
        if(Objects.nonNull(qc.getCompanyPersonNumber())){
            criteria.andCompanyPersonNumberGreaterThan(qc.getCompanyPersonNumber());
        }
        if(StringUtils.isNotBlank(qc.getAnnualTurnover())){
            criteria.andAnnualTurnoverGreaterThan(qc.getAnnualTurnover());
        }
        if(Objects.nonNull(qc.getRegCapital())){
            criteria.andRegCapitalGreaterThan(qc.getRegCapital());
        }
        return callContactsMapper.selectByExample(example);
    }
}
