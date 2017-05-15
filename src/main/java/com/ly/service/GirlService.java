package com.ly.service;

import com.ly.enums.ResultEnum;
import com.ly.exception.GirlException;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/5/14.
 */
@Service
public class GirlService {
    public void getAge(Integer age) throws Exception{
        if(age<=10){
            //Code:100
            throw new GirlException(ResultEnum.PRIMARY_SCHOOL);
        }else if(age>10&&age<18){//Code:101
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }
    }
}
