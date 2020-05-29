package com.demo.asd.dataResult;

public final class DataResults {
    public DataResults() {
    }

    public static boolean isOk(DataResult dr) {
        return dr != null && dr.getStatus() == 0;
    }

    public static boolean isFail(DataResult dr) {
        return !isOk(dr);
    }

    public static <T> DataResult<T> ok(T data) {
        return new DataResult(0, data, "");
    }

    public static <T> DataResult<T> fail(String message) {
        return new DataResult(-1, (Object)null, message);
    }

    public static <T> DataResult<T> fail(int status, String message) {
        return new DataResult(status, (Object)null, message);
    }
}
