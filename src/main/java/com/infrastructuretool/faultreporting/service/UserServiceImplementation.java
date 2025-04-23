package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public User saveUser(User user) {
        return null;
    }

    @Override
    public User updateUser(String username, User user) {
        return null;
    }

    @Override
    public void removeByUsername(String username) {

    }
}
