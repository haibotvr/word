package com.simon.boot.word.vo;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author simon.wei
 */
@Data
public class LoginVO {

    /**
     * 用户名
     */
    @NotBlank
    private String username;

    /**
     * 密码
     */
    @NotBlank
    private String password;

}
