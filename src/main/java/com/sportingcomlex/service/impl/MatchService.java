package com.sportingcomlex.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.sportingcomlex.service.IMatchservice;
import com.sportingcomplex.dao.IMatchDAO;
import com.sportingcomplex.dao.IUserDAO;
import com.sportingcomplex.model.MatchModel;
import com.sportingcomplex.model.UserModel;

public class MatchService implements IMatchservice{

	@Inject
	private IMatchDAO matchDao;
	@Inject
	private IUserDAO userDao;
	
	private void setType(MatchModel matchModel) {
		Long categoryId = matchModel.getCategoryId();
		if(categoryId == 1) {
			matchModel.setType("Bong Da");
		}
		else if(categoryId == 2) {
			matchModel.setType("Cau Long");
		}
		else matchModel.setType("Tennis");
	}
	 
	// them
	@Override
	public MatchModel save(MatchModel matchModel) {	
		// tìm trận đấu theo id_san, Time, dateOpen, categoryId
		MatchModel match = matchDao.findOne(matchModel.getId_San(), matchModel.getTime_Start(), matchModel.getDateOpen(), matchModel.getCategoryId());
		
		// TH1: trận đấu chưa có
		if(match == null) {
			matchModel.setStatus(true);
			setType(matchModel);
			Long id = matchDao.save(matchModel);
			return matchDao.findOneById(id);
		}
		
		// TH trận đấu đã có rồi nhưng status = false(đã bị hủy)
		else if(match.isStatus() == false) {
			// userName mới của người dùng trong trận đấu cbi đang xét
			String userNameNew = matchModel.getUserName();
			// userName cũ của người dùng trong trận đấu đã có sẵn trong db 
			String userNameOld = match.getUserName();
			
			// TH cái mới và cũ là của cùng 1 người đặt
			// thay đổi giá trị status của match cũ
			if(userNameNew.equals(userNameOld)) {
				matchDao.update(true, match.getId());
				match.setStatus(true);
				return match;
			}
			// TH trận đấu chuẩn bị thêm vào db là của user khác
			// lưu trận của matchModel mới, giữ nguyên của user cũ
			else {
				matchModel.setStatus(true);
				setType(matchModel);
				Long id = matchDao.save(matchModel);
				return matchDao.findOneById(id);
			}
		}
		return null;
	}

	
	// xoa
	@Override
	public MatchModel delete(MatchModel matchModel) {
		matchDao.delete(matchModel.getId_San(), matchModel.getTime_Start(), matchModel.getDateOpen(), matchModel.getType());
		return null;
	}

	// liet ke danh sach cho admin
	@Override
	public List<MatchModel> query() {
		return matchDao.query();
	}

	// liet ke danh sach cho user
	@Override
	public List<MatchModel> findAllByIdUser(UserModel user) {
		return matchDao.findAllByUserName(user.getUserName());
	}
}
