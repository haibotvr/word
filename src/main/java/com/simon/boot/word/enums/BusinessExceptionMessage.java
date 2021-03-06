package com.simon.boot.word.enums;

/**
 * @author simon.wei
 */
public enum BusinessExceptionMessage {

    AUTHENTICATION_FAILED("认证失败", 50008),
    LOGIN_NAME_OR_PASSWORD_FAULT("用户名或密码错误", 1001),
    LOGIN_NAME_IS_NOT_EXIST("用户名不存在", 1002),
    STORE_ID_IS_NOT_EXIST("店铺ID不存在", 1003),
    ADMIN_USER_IS_NOT_USE("用户已冻结", 1004),
    LOGIN_NAME_IS_EXIST("用户名已存在", 1005),
    VALIDATION_FAIL("校验失败", 50009),
    TOKEN_IS_EXPIRED("token过期", 50009),
    EXCEL_IS_NULL("空的excel文件", 50009);

    private String name;
    private Integer value;

    BusinessExceptionMessage(String name, Integer value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Integer getValue() {
        return value;
    }

}
