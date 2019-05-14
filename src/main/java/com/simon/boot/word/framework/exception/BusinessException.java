package com.simon.boot.word.framework.exception;

import lombok.Data;

/**
 * @author simon.wei
 */
@Data
public class BusinessException extends RuntimeException {

    private Integer code;
    private String message;

    public BusinessException(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
