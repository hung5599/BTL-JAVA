package com.sportingcomlex.service.impl;

import java.sql.Timestamp;
import java.util.List;

import javax.inject.Inject;

import com.sportingcomlex.service.ISportGroundService;
import com.sportingcomplex.dao.ISportGroundDAO;
import com.sportingcomplex.model.SportGroundModel;

public class SportGroundService implements ISportGroundService{

	@Inject
	private ISportGroundDAO sportGroundDAO;
	
	// liệt kê toàn bộ danh sách sân theo thể loại
	@Override
	public List<SportGroundModel> findGroundByCategoryId(Long CategoryId) {
		return sportGroundDAO.findGroundBycategoryId(CategoryId);
	}

	// thêm mới
	@Override
	public SportGroundModel save(SportGroundModel groundModel) {
		groundModel.setDateOpen(new Timestamp(System.currentTimeMillis()));
		Long groundId = sportGroundDAO.save(groundModel);
		return sportGroundDAO.findOne(groundId);
	}

	// sửa
	@Override
	public SportGroundModel update(SportGroundModel updateGround) {
//		SportGroundModel oldGround = sportGroundDAO.findOne(updateGround.getId());
		sportGroundDAO.update(updateGround);
		return sportGroundDAO.findOne(updateGround.getId());
	}

	// xóa
	@Override
	public void delete(Long[] ids) {
		for(Long id : ids) {
			sportGroundDAO.delete(id);
		}
	}
}
