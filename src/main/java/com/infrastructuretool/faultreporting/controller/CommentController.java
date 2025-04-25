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

    @PostMapping("/comment")
    public Comment save(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping("/comments")
    public List<Comment> getAllCommentsList(){
        return commentService.getAllComments();
    }

    @GetMapping("/comment/{id}")
    public Comment findById(@PathVariable ("id") Long id){
        return commentService.getCommentById(id);
    }

    @PutMapping("/update/comment/{id}")
    public Comment updateComment(@PathVariable ("id") Long id, @RequestBody Comment comment){
        return commentService.updateComment(id, comment);
    }

    @DeleteMapping("/delete/comment/{id}")
    public void deleteById(@PathVariable ("id") Long id){
        commentService.deleteById(id);
    }
}
