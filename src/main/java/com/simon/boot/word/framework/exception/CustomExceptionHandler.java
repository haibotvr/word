package com.simon.boot.word.framework.exception;

import com.simon.boot.word.framework.web.ReturnValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class CustomExceptionHandler {

    Logger log = LoggerFactory.getLogger(CustomExceptionHandler.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ReturnValue handleException(Exception e){
        log.error("捕获Controller异常:{}", e);
        return ReturnValue.error().setMessage(e.getMessage());
    }

    @ExceptionHandler(value = BusinessException.class)
    @ResponseBody
    public ReturnValue handleBusinessException(BusinessException e) {
        log.error("捕获Controller异常:{}", e);
        return ReturnValue.error().setCode(e.getCode()).setMessage(e.getMessage());
    }
}
