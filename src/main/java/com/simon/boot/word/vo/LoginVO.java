package com.simon.boot.word.vo;

import javax.validation.constraints.NotBlank;

/**
 * @author simon.wei
 */
public class LoginVO {

    /**
     * 用户名
     */
    @NotBlank(message = "请输入用户名")
    private String username;

    /**
     * 密码
     */
    @NotBlank(message = "请输入密码")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
