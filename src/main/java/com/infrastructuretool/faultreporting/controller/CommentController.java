package com.infrastructuretool.faultreporting.controller;

import com.infrastructuretool.faultreporting.model.Comment;
import com.infrastructuretool.faultreporting.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController (CommentService commentService){
        this.commentService = commentService;
    }

    @PostMapping("/comment")
    public Comment save(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }
}
