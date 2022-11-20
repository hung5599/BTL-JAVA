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

	// liệt kê tất cả các trận đấu đc đăng kí cho admin
	@Override
	public List<MatchModel> findAllByStatus(Boolean status) {
		String sql = "select * from match where status = 1";
		List<MatchModel> listMatch = query(sql, new MatchMapper());
		if(listMatch.isEmpty()) {
			return null;
		}
		return listMatch;
	}
	
	// liet ke danh sach cac tran dau cuar userName (cho user)
	@Override
	public List<MatchModel> findAllByUserName(String userName) {
		String sql = "select * from match where username = ? and status = 1";
		List<MatchModel> list = query(sql, new MatchMapper(), userName);
		return list.isEmpty() ? null : list;
	}

	// huy tran dau 
	@Override
	public void update(Boolean status, String time, Long categoryId, Date date, Long id_san) {
		String sql = "update match set status = ? where time = ? and id_san = ? and categoryid = ? and date_open = ?";
		update(sql, status, time, id_san, categoryId, date);
	}

	// update lai trang thai khi dat lai tran dau do 
	@Override
	public void updateById(Boolean status, Long id) {
		String sql = "update match set status = ? where id = ?";
		update(sql, status, id);
	}
	
	
	
}