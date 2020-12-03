package com.flyrain.sprinboot_springjpa;

import com.flyrain.sprinboot_springjpa.bean.User;
import com.flyrain.sprinboot_springjpa.jpa.UserRepository;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SprinbootSpringjpaApplication.class)
class SprinbootSpringjpaApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void contextLoads() {
        List<User> list = userRepository.findAll();
        System.out.println(list);
    }

}
