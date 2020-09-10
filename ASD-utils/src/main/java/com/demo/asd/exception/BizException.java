package com.demo.asd.exception;

/**
 * Created by cook on 2019/1/25
 */
public class BizException extends RuntimeException {

    private int errorCode = -1;

    public BizException(int errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public BizException(int errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    public BizException(String message) {
        super(message);
        this.errorCode = -1;
    }

    public BizException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = -1;
    }

    public int getErrorCode() {
        return errorCode;
    }
}
