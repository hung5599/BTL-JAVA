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
	
	// them trận đấu vào database
	@Override
	public MatchModel save(MatchModel matchModel) {
		// tim tran dau theo id_san, Time, dateOpen, categoryId
		MatchModel match = matchDao.findOne(matchModel.getId_San(), matchModel.getTime_Start(), matchModel.getDateOpen(), matchModel.getCategoryId());
		
		// TH1: trận đấu chưa có
		if(match == null) {
			matchModel.setStatus(true);
//			 lưu trận đấu 
			Long id = matchDao.save(matchModel);
			return matchDao.findOneById(id);
		}
		
		// TH tran dau co trong Database roi nhung da bi huy
		else if(match.isStatus() == false) {
			// userName moi cua tk moi ddang thuc thi viec dat tran moi
			String userNameNew = matchModel.getUserName();
			// userName cu cua user da tung dat tran dau va huy
			String userNameOld = match.getUserName();
			
			// TH tran dau dang dat la cua cung 1 nguoi
			if(userNameNew.equals(userNameOld)) {
				matchDao.updateById(true, match.getId());
				match.setStatus(true);
				return match;
			}
			// TH tran dau moi la cua user khac
			else {
				matchModel.setStatus(true);
				Long id = matchDao.save(matchModel);
				return matchDao.findOneById(id);
			}
		}
		return null;
	}

	// xóa trận đấu (chỉ admin có quyền xóa)
	@Override
	public MatchModel delete(MatchModel matchModel) {
		matchDao.delete(matchModel.getId_San(), matchModel.getTime_Start(), matchModel.getDateOpen(), matchModel.getCategoryId());
		return null;
	}

	// liet ke danh sach tran dau da duoc dat(cho admin)
	@Override
	public List<MatchModel> findAllByStatus(Boolean Status) {
		return matchDao.findAllByStatus(Status);
	}

	// liet ke danh sach các trận đấu (cho user)
	@Override
	public List<MatchModel> findAllByUserName(UserModel user) {
		return matchDao.findAllByUserName(user.getUserName());
	}

	// huy tran dau (cua user)
	@Override
	public void update(MatchModel matchModel) {
		matchDao.update(false, matchModel.getTime_Start(), matchModel.getCategoryId(), matchModel.getDateOpen(), matchModel.getId_San());
	}
}
