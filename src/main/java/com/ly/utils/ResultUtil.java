package com.ly.utils;

import com.ly.entity.Result;

/**
 * Created by Administrator on 2017/5/14.
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result=new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return  result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result=new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(null);
        return  result;
    }
}
