package com.simon.boot.word.framework.exception;

public class ValidException extends RuntimeException {

    private Integer code;
    private String message;

    public ValidException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
