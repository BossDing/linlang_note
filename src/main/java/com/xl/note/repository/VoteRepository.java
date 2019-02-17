package com.xl.note.repository;

import com.xl.note.domain.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Vote 仓库.
 */
public interface VoteRepository extends JpaRepository<Vote, Long>{
 
}
