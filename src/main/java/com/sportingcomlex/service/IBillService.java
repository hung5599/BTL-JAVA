package com.sportingcomlex.service;

import com.sportingcomplex.dao.GenericDAO;
import com.sportingcomplex.model.BillModel;
import com.sportingcomplex.model.MatchModel;

public interface IBillService extends GenericDAO<BillModel>{
	public BillModel findOneByIdMatch(Long idMatch);
	public BillModel save(MatchModel matchModel);
}




