package com.infrastructuretool.faultreporting.service;

import com.infrastructuretool.faultreporting.model.Comment;
import com.infrastructuretool.faultreporting.model.User;
import com.infrastructuretool.faultreporting.repository.CommentRepository;
import com.infrastructuretool.faultreporting.repository.FaultReportRepository;
import com.infrastructuretool.faultreporting.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImplementation implements CommentService{

    private final CommentRepository commentRepository;
    private final UserRepository userRepository;
    private final FaultReportRepository faultReportRepository;

    public CommentServiceImplementation(CommentRepository commentRepository, UserRepository userRepository, FaultReportRepository faultReportRepository) {
        this.commentRepository = commentRepository;
        this.userRepository = userRepository;
        this.faultReportRepository = faultReportRepository;
    }

    @Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }

    @Override
    public Comment getCommentById(Long id) {
        return commentRepository.findCommentById(id);
    }

    @Override
    public Comment saveComment(Comment comment, Long authorId, Long faultReportId) {
        User user = userRepository.getAuthorById(authorId);
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
