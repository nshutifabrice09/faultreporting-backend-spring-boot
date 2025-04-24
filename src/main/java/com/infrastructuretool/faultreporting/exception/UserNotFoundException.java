package com.infrastructuretool.faultreporting.exception;

public class UserNotFoundException extends RuntimeException{

    public UserNotFoundException (String username){
        super("Couldn't find a User with username "+username);
    }
}
