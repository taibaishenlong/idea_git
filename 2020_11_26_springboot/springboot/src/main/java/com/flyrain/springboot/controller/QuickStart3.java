package com.flyrain.springboot.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright (C),2020-2020,武汉厚溥教育科技有限公司
 * FileName：2020_11_26_springboot
 * Author：  联想
 * Date：    2020/12/2  11:42
 * Description：使用springboot快捷方式创建springboot
 * Version： 1.0
 */
@Controller
@ConfigurationProperties(prefix = "jim")
public class QuickStart3 {
    private String name;
    private Integer age;
    private String sex;

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @RequestMapping("/qu3")
    @ResponseBody
    public String  quick4(){
        return  "name  : "+name+" age : "+age+" sex : "+sex;
    }
}
