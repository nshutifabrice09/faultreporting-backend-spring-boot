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
        return userRepository.getUserByUsername(username);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(String username, User user) {
        User existUser = userRepository.getUserByUsername(username);
        if(existUser != null){
            existUser.setFirstName(user.getFirstName());
            existUser.setLastName(user.getFirstName());
            existUser.setUsername(user.getUsername());
            existUser.setEmail(user.getEmail());
            existUser.setPassword(user.getPassword());
            existUser.setPhoneNumber(user.getPhoneNumber());
            return userRepository.save(existUser);
        }
        return null;
    }

    @Override
    public void removeByUsername(String username) {
        userRepository.deleteByUsername(username);
    }
}
