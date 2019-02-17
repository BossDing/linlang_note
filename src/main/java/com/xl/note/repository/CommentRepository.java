package com.xl.note.repository;

import com.xl.note.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Comment 仓库.
 */
public interface CommentRepository extends JpaRepository<Comment, Long>{
 
}
