package com.sportingcomlex.service;

import com.sportingcomplex.model.MatchModel;
import com.sportingcomplex.model.UserModel;

import java.util.*;

public interface IMatchservice {
	MatchModel save(MatchModel matchModel);
	MatchModel delete(MatchModel matchModel);
	List<MatchModel> query();
	List<MatchModel> findAllByIdUser(UserModel user);
}
