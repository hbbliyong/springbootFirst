package com.ly.enums;

/**
 * Created by Administrator on 2017/5/14.
 */
public enum ResultEnum {
    UNKNOW_ERROR(-1,"未知错误"),
    SUCCESS(0,"成功"),
    PRIMARY_SCHOOL(100,"你可能还在上小学"),
    MIDDLE_SCHOOL(101,"你可能还在上中学"),
    ;

    private Integer code;
    private String msg;

    ResultEnum(Integer code,String msg) {
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
