package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.User;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
    List<User> getAllUsers();
    User getUserByUsername (String username);
    User saveUser(User user);
    User updateUser(String username, User user);
    void removeByUsername(String username);

}
