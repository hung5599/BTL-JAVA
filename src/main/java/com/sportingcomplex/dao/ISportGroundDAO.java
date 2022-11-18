package com.sportingcomplex.dao;

import java.util.*;

import com.sportingcomplex.model.SportGroundModel;
public interface ISportGroundDAO extends GenericDAO<SportGroundModel>{
	List<SportGroundModel> findGroundBycategoryId(Long categoryId);
	Long save(SportGroundModel groundModel);
	SportGroundModel findOne(Long id);
	void delete(Long id);
	void update(SportGroundModel upDateGround);
}
