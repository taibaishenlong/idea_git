package com.flyrain.springboot_redis.jpa;


import com.flyrain.springboot_redis.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    public List<User> findAll();

}
