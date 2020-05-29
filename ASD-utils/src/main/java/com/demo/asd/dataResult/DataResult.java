package com.demo.asd.dataResult;

public class DataResult<T> {
    public int status;
    public T data;
    public String message;

    public DataResult() {
    }

    public DataResult(int status, T data, String message) {
        this.status = status;
        this.data = data;
        this.message = message;
    }

    public int getStatus() {
        return this.status;
    }

    public T getData() {
        return this.data;
    }

    public String getMessage() {
        return this.message;
    }

    public void setStatus(final int status) {
        this.status = status;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public void setMessage(final String message) {
        this.message = message;
    }
}
