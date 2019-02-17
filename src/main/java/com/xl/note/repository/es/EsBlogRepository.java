package com.xl.note.repository.es;

import com.xl.note.domain.es.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Blog 存储库.
 */
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, String> {
 
	/**
	 * 模糊查询(去重)
	 */
	Page<EsBlog> findDistinctEsBlogByTitleContainingOrSummaryContainingOrContentContainingOrTagsContaining(String title,String Summary,String content,String tags,Pageable pageable);
	
	EsBlog findByBlogId(Long blogId);
}
