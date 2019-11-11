package com.hui.blog.exception;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/10/13
 */

/**
 * 该类用于封装异常的状态码和异常消息
 */
public enum CustomizeErrorCode implements ICustomizeErrorCode {

    ;

    private Integer code;
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }

    //有参构造函数
    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }



}