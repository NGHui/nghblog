package com.hui.blog.exception;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/10/13
 */
//封装异常的信息
public class CustomizeException extends RuntimeException {
    private String message;

    private Integer code;

    /**
     * 调用枚举中的方法
     * @param errorCode
     */
    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    public CustomizeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
    public Integer getCode() {
        return code;
    }
}