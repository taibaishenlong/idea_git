package com.flyRain.springboot.starter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Copyright (C),2020-2020,武汉厚溥教育科技有限公司
 * FileName：2020_11_26_springboot
 * Author：  联想
 * Date：    2020/11/26  16:59
 * Description：编写的controller
 * Version： 1.0
 */
@Controller
public class QuickStartController {

    @RequestMapping("/quick")
    @ResponseBody
    public String quickStart(){
        return "springboot访问成功";
    }

    @RequestMapping("/quick2")
    @ResponseBody
    public String quickStart2(){
        return "使用热部署试一下11111";
    }

    @RequestMapping("/quick3")
    @ResponseBody
    public String quickStart3(){
        return "使用热部署试一下2222222222222222";
    }
}
