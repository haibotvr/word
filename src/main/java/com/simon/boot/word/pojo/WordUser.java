package com.simon.boot.word.pojo;

import com.simon.boot.word.framework.abstracts.AbstractUser;

import java.util.Date;

public class WordUser extends AbstractUser{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_user.id
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_user.login_name
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    private String loginName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_user.real_name
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    private String realName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_user.login_password
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    private String loginPassword;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_user.create_time
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_user.update_time
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_user.e_status
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    private Integer eStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_user.user_id_card
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    private String userIdCard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_user.user_phone
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    private String userPhone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_user.user_email
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    private String userEmail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column word_user.user_avatar
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    private String userAvatar;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_user.id
     *
     * @return the value of word_user.id
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_user.id
     *
     * @param id the value for word_user.id
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_user.login_name
     *
     * @return the value of word_user.login_name
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_user.login_name
     *
     * @param loginName the value for word_user.login_name
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_user.real_name
     *
     * @return the value of word_user.real_name
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_user.real_name
     *
     * @param realName the value for word_user.real_name
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_user.login_password
     *
     * @return the value of word_user.login_password
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public String getLoginPassword() {
        return loginPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_user.login_password
     *
     * @param loginPassword the value for word_user.login_password
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword == null ? null : loginPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_user.create_time
     *
     * @return the value of word_user.create_time
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_user.create_time
     *
     * @param createTime the value for word_user.create_time
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_user.update_time
     *
     * @return the value of word_user.update_time
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_user.update_time
     *
     * @param updateTime the value for word_user.update_time
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_user.e_status
     *
     * @return the value of word_user.e_status
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public Integer geteStatus() {
        return eStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_user.e_status
     *
     * @param eStatus the value for word_user.e_status
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public void seteStatus(Integer eStatus) {
        this.eStatus = eStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_user.user_id_card
     *
     * @return the value of word_user.user_id_card
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public String getUserIdCard() {
        return userIdCard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_user.user_id_card
     *
     * @param userIdCard the value for word_user.user_id_card
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public void setUserIdCard(String userIdCard) {
        this.userIdCard = userIdCard == null ? null : userIdCard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_user.user_phone
     *
     * @return the value of word_user.user_phone
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public String getUserPhone() {
        return userPhone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_user.user_phone
     *
     * @param userPhone the value for word_user.user_phone
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_user.user_email
     *
     * @return the value of word_user.user_email
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public String getUserEmail() {
        return userEmail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_user.user_email
     *
     * @param userEmail the value for word_user.user_email
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail == null ? null : userEmail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column word_user.user_avatar
     *
     * @return the value of word_user.user_avatar
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public String getUserAvatar() {
        return userAvatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column word_user.user_avatar
     *
     * @param userAvatar the value for word_user.user_avatar
     *
     * @mbg.generated Thu May 16 17:00:48 CST 2019
     */
    public void setUserAvatar(String userAvatar) {
        this.userAvatar = userAvatar == null ? null : userAvatar.trim();
    }
}