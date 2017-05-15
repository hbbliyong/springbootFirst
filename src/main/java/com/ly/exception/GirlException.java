package com.ly.exception;

import com.ly.enums.ResultEnum;

/**
 * Created by Administrator on 2017/5/14.
 */
//这里使用RuntimeException而不是直接继承Exception，是因为Spring回滚事务只支持到RuntimeException
    //是RuntimeException Spring 才会进行事务回滚
public class GirlException extends RuntimeException {
    private Integer code;
public GirlException(ResultEnum resultEnum){
    super(resultEnum.getMsg());
    this.code=resultEnum.getCode();
}
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
