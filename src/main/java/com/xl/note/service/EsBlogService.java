package com.xl.note.service;
 

import java.util.List;

import com.xl.note.domain.Blog;
import com.xl.note.domain.User;
import com.xl.note.vo.TagVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.xl.note.domain.es.EsBlog;

/**
 * Blog 服务接口.
 */
public interface EsBlogService {
 	
	/**
	 * 删除Blog
	 */
	void removeEsBlog(String id);

	/**
	 * 将Blog转化为EsBlog
	 */
	EsBlog transfor(Blog blog);

	/**
	 * 传入EsBlog集合更新 EsBlog
	 */
	List<EsBlog> updateEsBlogList(List<EsBlog> list);

	/**
	 * 更新 EsBlog
	 */
	EsBlog updateEsBlog(EsBlog esBlog);
	
	/**
	 * 根据id获取Blog
	 */
	EsBlog getEsBlogByBlogId(Long blogId);
 
	/**
	 * 最新博客列表，分页
	 */
	Page<EsBlog> listNewestEsBlogs(String keyword, Pageable pageable);
 
	/**
	 * 最热博客列表，分页
	 */
	Page<EsBlog> listHotestEsBlogs(String keyword, Pageable pageable);
	
	/**
	 * 博客列表，分页
	 */
	Page<EsBlog> listEsBlogs(Pageable pageable);
	/**
	 * 最新前5
	 */
	List<EsBlog> listTop5NewestEsBlogs();
	
	/**
	 * 最热前5
	 */
	List<EsBlog> listTop5HotestEsBlogs();
	
	/**
	 * 最热前 30 标签
	 */
	List<TagVO> listTop30Tags();

	/**
	 * 最热前12用户
	 */
	List<User> listTop12Users();
}
