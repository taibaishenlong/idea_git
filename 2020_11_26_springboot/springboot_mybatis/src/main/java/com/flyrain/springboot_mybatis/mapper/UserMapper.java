package com.flyrain.springboot_mybatis.mapper;

import com.flyrain.springboot_mybatis.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository(value = "userMapper")
public interface UserMapper {
    @Select(value = "select * from user")
    public List<User> queryUserList();
}
