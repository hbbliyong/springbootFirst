package com.ly.handle;

import com.fasterxml.jackson.core.json.UTF8DataInputJsonParser;
import com.ly.entity.Result;
import com.ly.exception.GirlException;
import com.ly.utils.ResultUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 全局异常处理
 * Created by Administrator on 2017/5/14.
 */
@ControllerAdvice
public class ExceptionHandle {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException=(GirlException)e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else{
        return ResultUtil.error(-1,"位置错误");
    }
    }
}
