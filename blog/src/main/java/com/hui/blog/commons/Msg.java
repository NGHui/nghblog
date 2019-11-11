package com.hui.blog.commons;

/**
 * @author 辉
 * 座右铭:坚持总能遇见更好的自己!
 * @date 2019/9/21
 */


import com.hui.blog.exception.CustomizeErrorCode;
import com.hui.blog.exception.CustomizeException;

import java.util.HashMap;
import java.util.Map;

/**
 * 这个类用于封装json数据
 */
public class Msg<T> {

    //状态码   100-成功    200-失败
    private int code;
    //提示信息
    private String msg;
    //任意类型的对象
    private T data;

    //用户要返回给浏览器的数据
    private Map<String, Object> extend = new HashMap<String, Object>();

    /**
     * 返回的对象是Msg自己本身,这样的方法可以用于做链式编程
     *
     * @return
     */
    public static Msg success() {
        Msg result = new Msg();
        result.setCode(100);
        result.setMsg("处理成功！");
        return result;
    }

    public static <T> Msg success(T t) {
        Msg result = new Msg();
        result.setCode(100);
        result.setMsg("请求成功");
        result.setData(t);
        return result;
    }


    public static Msg fail() {
        Msg result = new Msg();
        result.setCode(200);
        result.setMsg("处理失败！");
        return result;
    }

    public static Msg fail(Integer code, String message) {
        Msg result = new Msg();
        result.setCode(code);
        result.setMsg(message);
        return result;
    }

    public static Msg fail(CustomizeErrorCode errorCode) {
        return fail(errorCode.getCode(), errorCode.getMessage());
    }

    public static Msg fail(CustomizeException e) {
        return fail(e.getCode(), e.getMessage());
    }
    public Msg add(String key, Object value) {
        this.getExtend().put(key, value);
        return this;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Map<String, Object> getExtend() {
        return extend;
    }

    public void setExtend(Map<String, Object> extend) {
        this.extend = extend;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}
