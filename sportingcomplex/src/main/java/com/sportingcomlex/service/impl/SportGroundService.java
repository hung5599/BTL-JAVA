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
	
	@Override
	public List<SportGroundModel> findGroundByCategoryId(Long CategoryId) {
		return sportGroundDAO.findGroundBycategoryId(CategoryId);
	}

	@Override
	public SportGroundModel save(SportGroundModel groundModel) {
		groundModel.setDateOpen(new Timestamp(System.currentTimeMillis()));
		Long groundId = sportGroundDAO.save(groundModel);
		return sportGroundDAO.findOne(groundId);
	}

	@Override
	public SportGroundModel update(SportGroundModel updateGround) {
//		SportGroundModel oldGround = sportGroundDAO.findOne(updateGround.getId());
		sportGroundDAO.update(updateGround);
		return sportGroundDAO.findOne(updateGround.getId());
	}

	@Override
	public void delete(Long[] ids) {
		for(Long id : ids) {
			sportGroundDAO.delete(id);
		}
	}
}
