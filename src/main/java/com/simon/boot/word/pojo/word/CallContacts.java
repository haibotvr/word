package com.simon.boot.word.pojo.word;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CallContacts implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "主键")
    private Long id;

    /**
     * 姓名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "姓名")
    private String realName;

    /**
     * 性别
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "性别")
    private String realSex;

    /**
     * 部门
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "部门")
    private String department;

    /**
     * 职务
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "职务")
    private String job;

    /**
     * 职务类别
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "职务类别")
    private String jobCategory;

    /**
     * 区号
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "区号")
    private String areaCode;

    /**
     * 电话
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "电话")
    private String telephone;

    /**
     * 分机号
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "分机号")
    private String extensionNumber;

    /**
     * 区号2
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "区号2")
    private String areaCode2;

    /**
     * 电话2
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "电话2")
    private String telephone2;

    /**
     * 分机号2
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "分机号2")
    private String extensionNumber2;

    /**
     * 手机号
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "手机号")
    private String phone;

    /**
     * 手机号2
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "手机号2")
    private String phone2;

    /**
     * 公司名称
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "公司名称")
    private String companyName;

    /**
     * 关键字
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "关键字")
    private String keywords;

    /**
     * 省份
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "省份")
    private String province;

    /**
     * 城市
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "城市")
    private String city;

    /**
     * 地址
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "地址")
    private String address;

    /**
     * 邮编
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "邮编")
    private String postCode;

    /**
     * 行业
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "行业")
    private String industry;

    /**
     * 行业(新)
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "行业(新)")
    private String industryNew;

    /**
     * 细分行业
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "细分行业")
    private String industryDetail;

    /**
     * 企业性质
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "企业性质")
    private String companyNature;

    /**
     * 公司人数
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "公司人数")
    private Integer companyPersonNumber;

    /**
     * PC数量
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "PC数量")
    private Integer pcNumber;

    /**
     * 年营业额
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "年营业额")
    private String annualTurnover;

    /**
     * 传真1
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "传真1")
    private String fax1;

    /**
     * 传真2
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "传真2")
    private String fax2;

    /**
     * 数据日期
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "数据日期")
    private String dataTime;

    /**
     * 来源人
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "来源人")
    private String fromPerson;

    /**
     * 数据来源
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "数据来源")
    private String dataFrom;

    /**
     * 状态
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "状态")
    private String dataStatus;

    /**
     * 邮箱1
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "邮箱1")
    private String email1;

    /**
     * 邮箱2
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "邮箱2")
    private String email2;

    /**
     * 备注
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "备注")
    private String remark;

    /**
     * 数据更新日期
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "数据更新日期")
    private String updateTime;

    /**
     * 企业邮箱
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "企业邮箱")
    private String officeEmail;

    /**
     * 是否AI行业
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "是否AI行业")
    private String industryAi;

    /**
     * 注册资本
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "注册资本")
    private Integer regCapital;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getRealSex() {
        return realSex;
    }

    public void setRealSex(String realSex) {
        this.realSex = realSex == null ? null : realSex.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getJobCategory() {
        return jobCategory;
    }

    public void setJobCategory(String jobCategory) {
        this.jobCategory = jobCategory == null ? null : jobCategory.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getExtensionNumber() {
        return extensionNumber;
    }

    public void setExtensionNumber(String extensionNumber) {
        this.extensionNumber = extensionNumber == null ? null : extensionNumber.trim();
    }

    public String getAreaCode2() {
        return areaCode2;
    }

    public void setAreaCode2(String areaCode2) {
        this.areaCode2 = areaCode2 == null ? null : areaCode2.trim();
    }

    public String getTelephone2() {
        return telephone2;
    }

    public void setTelephone2(String telephone2) {
        this.telephone2 = telephone2 == null ? null : telephone2.trim();
    }

    public String getExtensionNumber2() {
        return extensionNumber2;
    }

    public void setExtensionNumber2(String extensionNumber2) {
        this.extensionNumber2 = extensionNumber2 == null ? null : extensionNumber2.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2 == null ? null : phone2.trim();
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry == null ? null : industry.trim();
    }

    public String getIndustryNew() {
        return industryNew;
    }

    public void setIndustryNew(String industryNew) {
        this.industryNew = industryNew == null ? null : industryNew.trim();
    }

    public String getIndustryDetail() {
        return industryDetail;
    }

    public void setIndustryDetail(String industryDetail) {
        this.industryDetail = industryDetail == null ? null : industryDetail.trim();
    }

    public String getCompanyNature() {
        return companyNature;
    }

    public void setCompanyNature(String companyNature) {
        this.companyNature = companyNature == null ? null : companyNature.trim();
    }

    public Integer getCompanyPersonNumber() {
        return companyPersonNumber;
    }

    public void setCompanyPersonNumber(Integer companyPersonNumber) {
        this.companyPersonNumber = companyPersonNumber;
    }

    public Integer getPcNumber() {
        return pcNumber;
    }

    public void setPcNumber(Integer pcNumber) {
        this.pcNumber = pcNumber;
    }

    public String getAnnualTurnover() {
        return annualTurnover;
    }

    public void setAnnualTurnover(String annualTurnover) {
        this.annualTurnover = annualTurnover == null ? null : annualTurnover.trim();
    }

    public String getFax1() {
        return fax1;
    }

    public void setFax1(String fax1) {
        this.fax1 = fax1 == null ? null : fax1.trim();
    }

    public String getFax2() {
        return fax2;
    }

    public void setFax2(String fax2) {
        this.fax2 = fax2 == null ? null : fax2.trim();
    }

    public String getDataTime() {
        return dataTime;
    }

    public void setDataTime(String dataTime) {
        this.dataTime = dataTime == null ? null : dataTime.trim();
    }

    public String getFromPerson() {
        return fromPerson;
    }

    public void setFromPerson(String fromPerson) {
        this.fromPerson = fromPerson == null ? null : fromPerson.trim();
    }

    public String getDataFrom() {
        return dataFrom;
    }

    public void setDataFrom(String dataFrom) {
        this.dataFrom = dataFrom == null ? null : dataFrom.trim();
    }

    public String getDataStatus() {
        return dataStatus;
    }

    public void setDataStatus(String dataStatus) {
        this.dataStatus = dataStatus == null ? null : dataStatus.trim();
    }

    public String getEmail1() {
        return email1;
    }

    public void setEmail1(String email1) {
        this.email1 = email1 == null ? null : email1.trim();
    }

    public String getEmail2() {
        return email2;
    }

    public void setEmail2(String email2) {
        this.email2 = email2 == null ? null : email2.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public String getOfficeEmail() {
        return officeEmail;
    }

    public void setOfficeEmail(String officeEmail) {
        this.officeEmail = officeEmail == null ? null : officeEmail.trim();
    }

    public String getIndustryAi() {
        return industryAi;
    }

    public void setIndustryAi(String industryAi) {
        this.industryAi = industryAi == null ? null : industryAi.trim();
    }

    public Integer getRegCapital() {
        return regCapital;
    }

    public void setRegCapital(Integer regCapital) {
        this.regCapital = regCapital;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", realName=").append(realName);
        sb.append(", realSex=").append(realSex);
        sb.append(", department=").append(department);
        sb.append(", job=").append(job);
        sb.append(", jobCategory=").append(jobCategory);
        sb.append(", areaCode=").append(areaCode);
        sb.append(", telephone=").append(telephone);
        sb.append(", extensionNumber=").append(extensionNumber);
        sb.append(", areaCode2=").append(areaCode2);
        sb.append(", telephone2=").append(telephone2);
        sb.append(", extensionNumber2=").append(extensionNumber2);
        sb.append(", phone=").append(phone);
        sb.append(", phone2=").append(phone2);
        sb.append(", companyName=").append(companyName);
        sb.append(", keywords=").append(keywords);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", address=").append(address);
        sb.append(", postCode=").append(postCode);
        sb.append(", industry=").append(industry);
        sb.append(", industryNew=").append(industryNew);
        sb.append(", industryDetail=").append(industryDetail);
        sb.append(", companyNature=").append(companyNature);
        sb.append(", companyPersonNumber=").append(companyPersonNumber);
        sb.append(", pcNumber=").append(pcNumber);
        sb.append(", annualTurnover=").append(annualTurnover);
        sb.append(", fax1=").append(fax1);
        sb.append(", fax2=").append(fax2);
        sb.append(", dataTime=").append(dataTime);
        sb.append(", fromPerson=").append(fromPerson);
        sb.append(", dataFrom=").append(dataFrom);
        sb.append(", dataStatus=").append(dataStatus);
        sb.append(", email1=").append(email1);
        sb.append(", email2=").append(email2);
        sb.append(", remark=").append(remark);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", officeEmail=").append(officeEmail);
        sb.append(", industryAi=").append(industryAi);
        sb.append(", regCapital=").append(regCapital);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}