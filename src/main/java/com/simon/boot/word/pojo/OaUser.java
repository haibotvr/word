package com.simon.boot.word.pojo;

import com.simon.boot.word.framework.abstracts.AbstractUser;

import java.util.Date;

public class OaUser extends AbstractUser{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_user.id
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_user.login_name
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_user.login_password
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    private String loginPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_user.avatar
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_user.oa_status
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    private Integer oaStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_user.create_time
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_user.update_time
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oa_user.real_name
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    private String realName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_user.id
     *
     * @return the value of oa_user.id
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_user.id
     *
     * @param id the value for oa_user.id
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_user.login_name
     *
     * @return the value of oa_user.login_name
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_user.login_name
     *
     * @param loginName the value for oa_user.login_name
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_user.login_password
     *
     * @return the value of oa_user.login_password
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_user.login_password
     *
     * @param loginPassword the value for oa_user.login_password
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_user.avatar
     *
     * @return the value of oa_user.avatar
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_user.avatar
     *
     * @param avatar the value for oa_user.avatar
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_user.oa_status
     *
     * @return the value of oa_user.oa_status
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public Integer getOaStatus() {
        return oaStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_user.oa_status
     *
     * @param oaStatus the value for oa_user.oa_status
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public void setOaStatus(Integer oaStatus) {
        this.oaStatus = oaStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_user.create_time
     *
     * @return the value of oa_user.create_time
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_user.create_time
     *
     * @param createTime the value for oa_user.create_time
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_user.update_time
     *
     * @return the value of oa_user.update_time
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_user.update_time
     *
     * @param updateTime the value for oa_user.update_time
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oa_user.real_name
     *
     * @return the value of oa_user.real_name
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oa_user.real_name
     *
     * @param realName the value for oa_user.real_name
     *
     * @mbg.generated Tue Jun 04 10:08:50 CST 2019
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }
}