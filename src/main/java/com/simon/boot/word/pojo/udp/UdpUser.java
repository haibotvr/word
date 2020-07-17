package com.simon.boot.word.pojo.udp;

import com.simon.boot.word.framework.abstracts.AbstractUser;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class UdpUser extends AbstractUser implements Serializable {
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
     * 手机号
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "手机号")
    private String mobile;

    /**
     * 密码
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "密码")
    private String userPassword;

    /**
     * 用户名
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户名")
    private String userName;

    /**
     * 邮箱
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "邮箱")
    private String email;

    /**
     * 注册时间
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "注册时间")
    private Date registerTime;

    /**
     * 用户状态
     *
     * @mbg.generated
     */
    @ApiModelProperty(value = "用户状态")
    private Integer userStatus;

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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Date getRegisterTime() {
        return registerTime;
    }

    public void setRegisterTime(Date registerTime) {
        this.registerTime = registerTime;
    }

    public Integer getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(Integer userStatus) {
        this.userStatus = userStatus;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", realName=").append(realName);
        sb.append(", mobile=").append(mobile);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userName=").append(userName);
        sb.append(", email=").append(email);
        sb.append(", registerTime=").append(registerTime);
        sb.append(", userStatus=").append(userStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}