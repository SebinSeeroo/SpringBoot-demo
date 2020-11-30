package com.code.demo.Controller;

import com.code.demo.Entity.User;
import com.code.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/getall")
    public List<User> getAllUsers()
    {
        return userService.getAllUser();
    }
    @PostMapping("/adduser")
    public String addUser()
    {
         userService.addUser();
        return "Added";
    }
    @GetMapping("/maxid")
    public Long getMaxValue()
    {
        return userService.getMaxValue();
    }

}
