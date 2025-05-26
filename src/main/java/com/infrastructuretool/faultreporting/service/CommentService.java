package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAllComments();
    Comment getCommentById (Long id);
    Comment saveComment(Comment comment, Long authorId, Long faultReportId);

    Comment updateComment (Long id, Comment comment);
    void deleteById(Long id);
}
