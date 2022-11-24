package com.sportingcomlex.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.sportingcomlex.service.ICategoryService;
import com.sportingcomplex.dao.ICategoryDAO;
import com.sportingcomplex.model.CategoryModel;

public class CategoryService implements ICategoryService{

	@Inject
	private ICategoryDAO categoryDao;
	
	@Override
	public List<CategoryModel> findAll() {
		
		return categoryDao.findAll();
	}
	
}
