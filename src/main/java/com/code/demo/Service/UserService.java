package com.code.demo.Service;

import com.code.demo.Entity.User;
import com.code.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @PostConstruct
    public void initDB(){
        userRepository.save(new User(1,"Sebin","Sebastian","Address1","Address2","Idukki",25,new java.sql.Date(System.currentTimeMillis()),new java.sql.Date(System.currentTimeMillis())));
        userRepository.save(new User(2,"Sebin1","Sebastian1","Address1","Address2","Idukki",25,new java.sql.Date(System.currentTimeMillis()),new java.sql.Date(System.currentTimeMillis())));
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public String addUser(){
        userRepository.save(new User((getMaxValue() + 1),"Sebin","Sebastian","Address1","Address2","Idukki",25,new java.sql.Date(System.currentTimeMillis()),new java.sql.Date(System.currentTimeMillis())));
        return "Done";
    }

    public Long getMaxValue(){
        return userRepository.findFirstByOrderByIdDesc().getId();
    }
}
