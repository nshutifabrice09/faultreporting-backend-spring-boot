package com.infrastructuretool.faultreporting.controller;

import com.infrastructuretool.faultreporting.model.User;
import com.infrastructuretool.faultreporting.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/users")
    public List<User> userList(){
        return userService.getAllUsers();
    }

    @GetMapping("/user/{username}")
    public User findByUsername(@PathVariable ("username") String username){
        return userService.getUserByUsername(username);
    }

    @PutMapping("/update/user/{username}")
    public User updateUser(@PathVariable ("username") String username, @RequestBody User user){
        return userService.updateUser(username, user);
    }

    @DeleteMapping("/delete/user/{username}")
    public void removeByUsername (@PathVariable ("username") String username){
        userService.removeByUsername(username);
    }
}
