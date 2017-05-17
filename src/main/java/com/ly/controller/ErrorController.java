package com.ly.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 错误页面
 * Created by Administrator on 2017/5/16.
 */
@Controller
@RequestMapping("/")
public class ErrorController {
    @RequestMapping("/404")
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String notFoundError(){
        return   "error/404";
    }

    @RequestMapping("/500")
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String interdError(){
        return "error/500";
    }
}
