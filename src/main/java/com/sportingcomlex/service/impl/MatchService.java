package com.sportingcomlex.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.sportingcomlex.service.IMatchservice;
import com.sportingcomplex.dao.IBillDAO;
import com.sportingcomplex.dao.IMatchDAO;
import com.sportingcomplex.dao.IUserDAO;
import com.sportingcomplex.model.BillModel;
import com.sportingcomplex.model.MatchModel;
import com.sportingcomplex.model.UserModel;

public class MatchService implements IMatchservice{

	@Inject
	private IMatchDAO matchDao;
	@Inject
	private IBillDAO billDao;
	
	// them trận đấu vào database
	@Override
	public MatchModel save(MatchModel matchModel) {
		// tim tran dau theo id_san, Time, dateOpen, categoryId
		MatchModel match = matchDao.findOne(matchModel.getId_San(), matchModel.getTime_Start(), matchModel.getDateOpen(), matchModel.getCategoryId());
		
		// TH1: trận đấu chưa có
		if(match == null) {
			matchModel.setStatus(true);
//			 luu tran dau 
			Long id = matchDao.save(matchModel);
			return matchDao.findOneById(id);
		}
		return null;
	}

	// xóa trận đấu (chỉ admin có quyền xóa)
	@Override
	public MatchModel delete(MatchModel matchModel) {
		matchDao.delete(matchModel.getId_San(), matchModel.getTime_Start(), matchModel.getDateOpen(), matchModel.getCategoryId());
		return null;
	}

	// liet ke danh sach cac tran dau 
	@Override
	public List<MatchModel> findAll() {
		return matchDao.findAll();
	}

	// huy tran dau (cua user)
	@Override
	public void update(MatchModel matchModel) {
		billDao.delete(matchModel.getId());
		matchDao.updateById(matchModel.getId());
	}
}
