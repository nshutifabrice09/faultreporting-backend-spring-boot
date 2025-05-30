package com.infrastructuretool.faultreporting.repository;

import com.infrastructuretool.faultreporting.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository <Comment, Long> {
    Comment findCommentById(Long id);
}
