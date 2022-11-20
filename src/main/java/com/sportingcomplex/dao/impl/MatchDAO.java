package com.sportingcomplex.dao.impl;

import java.util.Date;
import java.util.List;

import com.sportingcomlex.mapper.MatchMapper;
import com.sportingcomplex.dao.IMatchDAO;
import com.sportingcomplex.model.MatchModel;

public class MatchDAO extends AbstractDAO<MatchModel> implements IMatchDAO{

	// lưu vào data vao database
	@Override
	public Long save(MatchModel matchModel) {
		String sql = "insert into match(id_san, time, status, date_open, username, price, categoryid) values(?, ?, ?, ?, ?, ?, ?)";
		return insert(sql, matchModel.getId_San(), matchModel.getTime_Start(), matchModel.isStatus(), matchModel.getDateOpen(), matchModel.getUserName(), matchModel.getPrice(), matchModel.getCategoryId());
	}

	// tìm 1 trận đấu theo id_San, khung gio, ngay
	@Override
	public MatchModel findOne(Long id_San, String time, Date dateOpen, Long categoryId) {
		String sql = "select * from match where id_san = ? and time = ? and date_open = ? and categoryid = ?";
		List<MatchModel> matchList = query(sql, new MatchMapper(), id_San, time, dateOpen, categoryId);
		if(matchList.isEmpty()) {
			return null;
		}
		return matchList.get(0);
	}

	// tim kiem thong tin tran dau theo id tran
	@Override
	public MatchModel findOneById(Long id) {
		String sql = "select * from match where id = ?";
		List<MatchModel> list = query(sql, new MatchMapper(), id);
		if(list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	// xoas tran dau ra khoi database
	@Override
	public void delete(Long id_san, String time_Start, Date dateOpen, Long ccategoryId) {
		String sql = "delete from match where id_san = ? and time = ? and date_open = ? and categoryid = ?";
		update(sql, id_san, time_Start, dateOpen, ccategoryId);
	}
	
	// liet ke danh sach cac tran dau cuar userName (cho user)
	@Override
	public List<MatchModel> findAllByUserName() {
		String sql = "select * from match where status = 1";
		List<MatchModel> list = query(sql, new MatchMapper());
		return list.isEmpty() ? null : list;
	}

	// update lai trang thai khi dat lai tran dau do 
	@Override
	public void updateById(Long id) {
		String sql = "delete from match where id = ?";
		update(sql, id);
	}
}
