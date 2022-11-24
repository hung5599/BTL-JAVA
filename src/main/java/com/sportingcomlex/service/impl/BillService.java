package com.sportingcomlex.service.impl;

import javax.inject.Inject;

import com.sportingcomlex.service.IBillService;
import com.sportingcomplex.dao.IBillDAO;
import com.sportingcomplex.dao.impl.AbstractDAO;
import com.sportingcomplex.model.BillModel;
import com.sportingcomplex.model.MatchModel;

public class BillService extends AbstractDAO<BillModel> implements IBillService{

	@Inject
	private IBillDAO billDao;

	// tìm kiếm 1 hóa đơn theo id trận đấu
	@Override
	public BillModel findOneByIdMatch(Long idMatch) {
		return billDao.findOneByIdMatch(idMatch);
	}

	// luu hoa don vao 
	@Override
	public BillModel save(MatchModel matchModel) {
		String type;
		Long categoryId = matchModel.getCategoryId();
		if(categoryId == 1) {
			type = "Sân Bóng Đá";
		}
		else if (categoryId == 2) {
			type = "Sân Cầu Lông";
		}
		else type = "Sân Tennis";
		Long id = billDao.save(matchModel.getId(), matchModel.getDateOpen(), matchModel.getPrice(), matchModel.getUserName(), type);
		return billDao.findOneById(id);
	}
}