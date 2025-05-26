package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.Comment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImplementation implements CommentService{
    @Override
    public List<Comment> getAllComments() {
        return null;
    }

    @Override
    public Comment getCommentById(Long id) {
        return null;
    }

    @Override
    public Comment saveComment(Comment comment, Long authorId, Long faultReportId) {
        return null;
    }

    @Override
    public Comment saveComment(Comment comment) {
        return null;
    }

    @Override
    public Comment updateComment(Long id, Comment comment) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
}
