package com.xl.note.service;

import com.xl.note.domain.Blog;
import com.xl.note.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xl.note.domain.Catalog;

/**
 * Blog 服务接口.
 */
public interface BlogService {
	/**
	 * 保存Blog
	 */
	Blog saveBlog(Blog blog);
	
	/**
	 * 删除Blog
	 */
	void removeBlog(Long id);
	
	/**
	 * 根据id获取Blog
	 */
	Blog getBlogById(Long id);

	/**
	 * 列出所有用户的所有博客
	 */
	Page<Blog> listBlogs(Pageable pageable);
	
	/**
	 * 根据用户名进行分页模糊查询（最新）
	 */
	Page<Blog> listBlogsByTitleVote(User user, String title, Pageable pageable);
 
	/**
	 * 根据用户名进行分页模糊查询（最热）
	 */
	Page<Blog> listBlogsByTitleVoteAndSort(User suser, String title, Pageable pageable);
	
	/**
	 * 根据分类进行查询
	 */
	Page<Blog> listBlogsByCatalog(Catalog catalog, Pageable pageable); 
	/**
	 * 阅读量递增
	 */
	void readingIncrease(Long id);
	
	/**
	 * 发表评论
	 */
	Blog createComment(Long blogId, String commentContent);
	
	/**
	 * 删除评论
	 */
	void removeComment(Long blogId, Long commentId);
	
	/**
	 * 点赞
	 */
	Blog createVote(Long blogId);
	
	/**
	 * 取消点赞
	 */
	void removeVote(Long blogId, Long voteId);
}
