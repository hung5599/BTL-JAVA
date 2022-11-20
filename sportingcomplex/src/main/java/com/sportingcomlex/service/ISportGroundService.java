package com.sportingcomlex.service;

import java.util.*;

import com.sportingcomplex.model.SportGroundModel;

public interface ISportGroundService {
	List<SportGroundModel> findGroundByCategoryId(Long CategoryId);
	SportGroundModel save(SportGroundModel groundModel);
	SportGroundModel update(SportGroundModel updateGround);
	void delete(Long[] ids);
}