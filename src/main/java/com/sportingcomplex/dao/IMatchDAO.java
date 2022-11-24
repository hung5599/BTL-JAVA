package com.sportingcomplex.dao;

import java.util.Date;
import java.util.List;

import com.sportingcomplex.model.MatchModel;

public interface IMatchDAO extends GenericDAO<MatchModel>{
	Long save(MatchModel matchModel);
	MatchModel findOne(Long id_San, String time, Date dateOpen, Long catrgoryId);
	MatchModel findOneById(Long id);
	void delete(Long id);
	List<MatchModel> findAll();
}
