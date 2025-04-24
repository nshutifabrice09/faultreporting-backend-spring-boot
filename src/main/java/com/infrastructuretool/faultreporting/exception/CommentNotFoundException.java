package com.infrastructuretool.faultreporting.exception;

public class CommentNotFoundException extends RuntimeException {

    public CommentNotFoundException (Long id){
        super ("Couldn't find a comment with id "+id);
    }
}
