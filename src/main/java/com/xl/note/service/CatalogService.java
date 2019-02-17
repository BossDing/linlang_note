package com.xl.note.service;

import java.util.List;

import com.xl.note.domain.Catalog;
import com.xl.note.domain.User;

/**
 * Catalog 服务接口.
 */
public interface CatalogService {
	/**
	 * 保存Catalog
	 */
	Catalog saveCatalog(Catalog catalog);
	
	/**
	 * 删除Catalog
	 */
	void removeCatalog(Long id);

	/**
	 * 根据id获取Catalog
	 */
	Catalog getCatalogById(Long id);
	
	/**
	 * 获取Catalog列表
	 */
	List<Catalog> listCatalogs(User user);
}
