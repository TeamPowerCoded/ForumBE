package com.forum.capstone.service;

import java.util.List;
import java.util.Map;

import com.forum.capstone.persistence.model.Category;

public interface CategoryService {

	Map<String, Object> getNewPostPageWithCategoryName(String categoryName);

	Map<String, Object> getNewPostPageWithCategorySelect();

	int save(Category category);

	List<Category> findAll();

}
