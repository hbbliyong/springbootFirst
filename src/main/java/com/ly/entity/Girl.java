package com.ly.entity;

import javax.validation.constraints.Min;

/**
 * Created by Administrator on 2017/5/14.
 */

public class Girl {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer id;
    private String name;
    @Min(value=18,message = "未成年少女不得入内")
    private Integer age;
}
