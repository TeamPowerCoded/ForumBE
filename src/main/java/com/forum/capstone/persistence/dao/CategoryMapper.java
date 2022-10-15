package com.forum.capstone.persistence.dao;

import java.util.List;

import com.forum.capstone.persistence.model.Category;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CategoryMapper {

	Category findByName(String categoryName);

	int save(Category category);

	List<Category> findAll();

}
