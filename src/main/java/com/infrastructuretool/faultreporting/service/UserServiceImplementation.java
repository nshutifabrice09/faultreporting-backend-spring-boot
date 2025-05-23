package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.User;
import com.infrastructuretool.faultreporting.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImplementation implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
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
        userRepository.deleteByUsername(username);
    }
}
