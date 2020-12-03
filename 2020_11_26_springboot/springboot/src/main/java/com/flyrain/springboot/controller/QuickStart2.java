package com.flyrain.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
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
public class QuickStart2 {
    /*获取yaml文件中的普通属性*/
    @Value("${name}")
    private String name;

    /*获取yaml文件中的对象属性*/
    @Value("${person.addr}")
    private String addr;

    @Value("${person.age}")
    private Integer age;

    @Value("${kuku.addr}")
    private String addr1;
    @RequestMapping("/qu2")
    @ResponseBody
    public String  quick3(){
        return  "name  : "+name+" age : "+age+" addr : "+addr +"  : "+addr1;
    }
}
