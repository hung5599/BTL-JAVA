package com.sportingcomplex.dao;

import java.util.*;

import com.sportingcomlex.mapper.RowMapper;
public interface GenericDAO<T> {
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	Long insert(String sql, Object... parameters);
	void update(String sql, Object... parameters);
	Long search(String sql, Object...parameters);
	
}