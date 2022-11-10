package com.sportingcomplex.dao;

import java.util.*;

import com.sportingcomplex.model.CategoryModel;
public interface ICategoryDAO extends GenericDAO<CategoryModel>{
	List<CategoryModel> findAll();
}
