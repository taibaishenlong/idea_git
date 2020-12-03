package com.flyrain.sprinboot_springjpa.jpa;

import com.flyrain.sprinboot_springjpa.bean.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface UserRepository extends JpaRepository<User,Long> {
    public List<User> findAll();

}
