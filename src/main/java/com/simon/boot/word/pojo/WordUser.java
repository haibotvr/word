package com.simon.boot.word.pojo;

import com.simon.boot.word.framework.abstracts.AbstractUser;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class WordUser extends AbstractUser implements Serializable {
    /**
     * 用户主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户主键")
    private Long id;

    /**
     * 用户名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户名")
    private String loginName;

    /**
     * 真实姓名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "真实姓名")
    private String realName;

    /**
     * 密码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "密码")
    private String loginPassword;

    /**
     * 创建时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    /**
     * 修改时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    /**
     * 状态
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "状态")
    private Integer ewStatus;

    /**
     * 身份证号
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "身份证号")
    private String userIdCard;

    /**
     * 电话号码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "电话号码")
    private String userPhone;

    /**
     * 邮箱
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "邮箱")
    private String userEmail;

    /**
     * 头像
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "头像")
    private String userAvatar;

    /**
     * 学校主键
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "学校主键")
    private Long schoolId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getEwStatus() {
        return ewStatus;
    }

    public void setEwStatus(Integer ewStatus) {
        this.ewStatus = ewStatus;
    }

    public String getUserIdCard() {
        return userIdCard;
    }

    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard == null ? null : userIdCard.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    public String getUserAvatar() {
        return userAvatar;
    }

    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar == null ? null : userAvatar.trim();
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", loginName=").append(loginName);
        sb.append(", realName=").append(realName);
        sb.append(", loginPassword=").append(loginPassword);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", ewStatus=").append(ewStatus);
        sb.append(", userIdCard=").append(userIdCard);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", userEmail=").append(userEmail);
        sb.append(", userAvatar=").append(userAvatar);
        sb.append(", schoolId=").append(schoolId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}