package com.sportingcomplex.dao.impl;

import java.util.List;

import com.sportingcomlex.mapper.CategoryMapper;
import com.sportingcomplex.dao.ICategoryDAO;
import com.sportingcomplex.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO{
	
	@Override
	public List<CategoryModel> findAll() {
		String sql = "select * from category";
		return query(sql, new CategoryMapper());
	}
}