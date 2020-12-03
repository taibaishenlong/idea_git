package com.flyrain.springboot.controller;

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
public class QuickStart {

    @RequestMapping("/qu")
    @ResponseBody
    public String  quick3(){
        return  "使用springboot快速启动项来进行热部55555署";
    }
}
