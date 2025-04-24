package com.infrastructuretool.faultreporting.controller;

import com.infrastructuretool.faultreporting.model.User;
import com.infrastructuretool.faultreporting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController (UserService userService){
        this.userService = userService;
    }

    @PostMapping("/user")
    public User save(@RequestBody User user){
        return userService.saveUser(user);
    }
}
