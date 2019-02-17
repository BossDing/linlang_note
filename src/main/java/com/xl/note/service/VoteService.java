package com.xl.note.service;

import com.xl.note.domain.Vote;

/**
 * Vote 服务接口.
 */
public interface VoteService {

	/**
	 * 根据id获取 Vote
	 */
	Vote getVoteById(Long id);

	/**
	 * 删除Vote
	 */
	void removeVote(Long id);
}
