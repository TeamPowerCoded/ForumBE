package com.forum.capstone.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.forum.capstone.persistence.dao.CategoryMapper;
import com.forum.capstone.persistence.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.capstone.constant.PageMessage;
import com.forum.capstone.service.CategoryService;
import com.forum.capstone.web.dto.PostDto;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryMapper categoryMapper;

	@Override
	public int save(Category category) {
		return this.categoryMapper.save(category);
	}

	@Override
	public Map<String, Object> getNewPostPageWithCategoryName(String categoryName) {
		Map<String, Object> attributes = new HashMap<>();
		Category category = this.categoryMapper.findByName(categoryName);
		attributes.put("title", PageMessage.MESSAGE_NEW_POST_EN);
		PostDto newPostForm = new PostDto();
		newPostForm.setCategory(category.getName());
		attributes.put("postDto", newPostForm);
		attributes.put("isQuickNewPost", false);
		return attributes;
	}

	@Override
	public Map<String, Object> getNewPostPageWithCategorySelect() {
		List<Category> categories = this.categoryMapper.findAll();
		Map<String, Object> attributes = new HashMap<>();
		attributes.put("title", PageMessage.MESSAGE_NEW_POST_EN);
		attributes.put("categories", categories);
		attributes.put("postDto", new PostDto());
		attributes.put("isQuickNewPost", true);
		return attributes;
	}

	@Override
	public List<Category> findAll() {
		return this.categoryMapper.findAll();
	}

}
