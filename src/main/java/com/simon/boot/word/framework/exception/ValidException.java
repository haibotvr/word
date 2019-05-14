package com.simon.boot.word.framework.exception;

public class ValidException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ValidException(String message){
        super(message);
    }

    public ValidException() {
        super();
    }

    public ValidException(String message, Throwable cause) {
        super(message, cause);
    }

    public ValidException(Throwable cause) {
        super(cause);
    }

}
