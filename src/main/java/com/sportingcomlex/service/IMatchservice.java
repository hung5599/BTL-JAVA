package com.sportingcomlex.service;

import java.util.List;

import com.sportingcomplex.model.MatchModel;
import com.sportingcomplex.model.UserModel;

public interface IMatchservice {
	MatchModel save(MatchModel matchModel);
	MatchModel delete(MatchModel matchModel);
	void update(MatchModel matchModel);
	List<MatchModel> query(Boolean status);
	List<MatchModel> findAllByUserName(UserModel user);
}
