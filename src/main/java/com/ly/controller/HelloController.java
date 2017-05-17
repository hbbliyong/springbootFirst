package com.ly.controller;

import com.ly.entity.Girl;
import com.ly.entity.Result;
import com.ly.utils.ResultUtil;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.validation.Valid;


/**
 * Created by Administrator on 2017/5/12.
 */
@Controller
@RequestMapping(value="/")
public class HelloController {
    private final Logger log= LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/hello")
    public String hello(){

        log.debug("debug level log");
        log.info("info level log");
        log.warn("warn level log");
        log.error("error level log");

        return "hello world11222iii3";
    }

    @RequestMapping("/hi/{name}")
    public String hi(@PathVariable String name){
        return "hello  "+name;
    }
    //验证
    @RequestMapping("/addGirl")
    public Result addGirl(@Valid Girl girl, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            String msg=bindingResult.getFieldError().getDefaultMessage();
            return ResultUtil.error(1,msg);
        }
        girl.setAge(girl.getAge()+1);
        return ResultUtil.success(girl);
    }
    @RequestMapping("/getImage")
    @ResponseBody
    public String image(){
        return "hello world <img src=\"images/demo.jpg\">";
    }
//    @RequestMapping("/index")
//    public String index(){
//        return "index";
//    }
    @RequestMapping("/testTh")
    public String testTh(ModelMap map){
        map.addAttribute("msg","Hello, rensanning! @Thymeleaf");
        return "test_th";
    }
}
