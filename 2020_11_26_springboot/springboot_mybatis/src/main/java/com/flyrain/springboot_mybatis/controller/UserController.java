package com.flyrain.springboot_mybatis.controller;

import com.flyrain.springboot_mybatis.bean.User;
import com.flyrain.springboot_mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Copyright (C),2020-2020,武汉厚溥教育科技有限公司
 * FileName：2020_11_26_springboot
 * Author：  联想
 * Date：    2020/12/2  16:48
 * Description：controller类
 * Version： 1.0
 */
@Controller
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/queryuser")
    @ResponseBody
    public List<User> queryList(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
}
