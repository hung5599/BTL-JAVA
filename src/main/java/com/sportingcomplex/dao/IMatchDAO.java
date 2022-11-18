package com.sportingcomplex.dao;

import java.sql.Timestamp;
import java.util.*;

import com.sportingcomplex.model.MatchModel;

public interface IMatchDAO extends GenericDAO<MatchModel>{
	Long save(MatchModel matchModel);
	MatchModel findOne(Long id_San, String time, Date dateOpen, Long catrgoryId);
	MatchModel findOneById(Long id);
	void update(Boolean status, Long id);
	void delete(Long id_san, String time_Start, Date dateOpen, String type);
	List<MatchModel> query();
	List<MatchModel> findAllByUserName(String userName);
}
