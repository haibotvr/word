package com.simon.boot.word.dto;

/**
 * @author simon.wei
 */
public class UserLoginDTO {

    private String token;

    private String tokenHead;

    public String getTokenHead() {
        return tokenHead;
    }

    public void setTokenHead(String tokenHead) {
        this.tokenHead = tokenHead;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
