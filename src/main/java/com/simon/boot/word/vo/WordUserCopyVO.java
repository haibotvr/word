package com.simon.boot.word.vo;

import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class WordUserCopyVO implements Serializable {
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

    @ApiModelProperty(value = "角色")
    private List<Long> roleIds;

    private List<String> roleNames;

    private String roleName;

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

    public List<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Long> roleIds) {
        this.roleIds = roleIds;
    }

    public List<String> getRoleNames() {
        return roleNames;
    }

    public void setRoleNames(List<String> roleNames) {
        this.roleNames = roleNames;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String toString() {
        return "WordUserCopyVO{" +
                "id=" + id +
                ", loginName='" + loginName + '\'' +
                ", realName='" + realName + '\'' +
                ", loginPassword='" + loginPassword + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", ewStatus=" + ewStatus +
                ", userIdCard='" + userIdCard + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userAvatar='" + userAvatar + '\'' +
                ", schoolId=" + schoolId +
                ", roleIds=" + roleIds +
                ", roleNames=" + roleNames +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}