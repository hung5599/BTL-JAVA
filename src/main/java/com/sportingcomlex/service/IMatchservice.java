package com.sportingcomlex.service;

import java.util.List;

import com.sportingcomplex.model.MatchModel;

public interface IMatchservice {
	MatchModel save(MatchModel matchModel);
	void update(MatchModel matchModel);
	List<MatchModel> findAll();
}
