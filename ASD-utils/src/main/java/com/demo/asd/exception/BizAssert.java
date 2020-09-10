package com.demo.asd.exception;

/**
 * 简单判断表达式 <code>express</code>, 如果为false, 则抛出业务异常. <br>
 *     该业务异常, 会被Advice拦截到, 返回一个status-code=200响应, 切为JSON格式. <br>
 *     可以适当加入自己需要的常用方法, 比如: notNull()
 * Created by cook on 2019/1/25
 */
public abstract class BizAssert {

    /**
     * 断言为 true
     * @param express
     * @param message
     */
    public static void isTrue(boolean express, String message) {
        if (!express) {
            throw new BizException(-1, message);
        }
    }

    /**
     * 断言为 true
     * @param express
     * @param errorCode
     * @param message
     */
    public static void isTrue(boolean express, int errorCode, String message) {
        if (!express) {
            throw new BizException(errorCode, message);
        }
    }

}
