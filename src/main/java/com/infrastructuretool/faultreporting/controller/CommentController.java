package com.infrastructuretool.faultreporting.controller;

import com.infrastructuretool.faultreporting.model.Comment;
import com.infrastructuretool.faultreporting.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class CommentController {

    private final CommentService commentService;

    @Autowired
    public CommentController (CommentService commentService){
        this.commentService = commentService;
    }

}
