package com.ly.controller;

import com.ly.service.GirlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/5/14.
 */
@Controller
@RequestMapping("/girl")
public class GirlController {
    @Autowired
    GirlService girlService;
    @RequestMapping("/getAge/{age}")
    public void getAge(@PathVariable Integer age) throws Exception {
        girlService.getAge(age);
    }
}
