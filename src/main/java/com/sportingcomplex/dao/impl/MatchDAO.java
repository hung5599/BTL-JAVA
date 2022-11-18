package com.sportingcomplex.dao.impl;

import java.sql.Timestamp;
import java.util.*;

import com.sportingcomlex.mapper.MatchMapper;
import com.sportingcomplex.dao.IMatchDAO;
import com.sportingcomplex.model.MatchModel;

public class MatchDAO extends AbstractDAO<MatchModel> implements IMatchDAO{

	// lưu vào data vao database
	@Override
	public Long save(MatchModel matchModel) {
		String sql = "insert into match_1(Id_Sân, id_user, Time_Start, Status, Date_Open, username, price, categoryid, type) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";
		return insert(sql, matchModel.getId_San(), matchModel.getId_user(), matchModel.getTime_Start(), matchModel.isStatus(), matchModel.getDateOpen(), matchModel.getUserName(), matchModel.getPrice(), matchModel.getCategoryId(), matchModel.getType());
	}

	// tìm 1 trận đấu theo id_San, khung gio, ngay
	@Override
	public MatchModel findOne(Long id_San, String time, Date dateOpen, Long categoryId) {
		String sql = "select * from match_1 where Id_Sân = ? and Time_Start = ? and Date_Open = ? and categoryid = ?";
		List<MatchModel> matchList = query(sql, new MatchMapper(), id_San, time, dateOpen, categoryId);
		if(matchList.isEmpty()) {
			return null;
		}
		return matchList.get(0);
	}

	// tim kiem thong tin tran dau theo id tran
	@Override
	public MatchModel findOneById(Long id) {
		String sql = "select * from match_1 where Id = ?";
		List<MatchModel> list = query(sql, new MatchMapper(), id);
		return list.isEmpty() ? null : list.get(0);
	}

	// xoas tran dau ra khoi database
	@Override
	public void delete(Long id_san, String time_Start, Date dateOpen, String type) {
		String sql = "delete from match_1 where Id_Sân = ? and Time_Start = ? and Date_Open = ? and type = ?";
		update(sql, id_san, time_Start, dateOpen, type);
	}

	// liệt kê tất cả các trận đấu đc đăng ki cho admin
	@Override
	public List<MatchModel> query() {
		String sql = "select * from match_1";
		List<MatchModel> listMatch = query(sql, new MatchMapper());
		return listMatch;
	}
	
	// liet ke danh sach cac tran dau cuar userName (cho user)
	@Override
	public List<MatchModel> findAllByUserName(String userName) {
		String sql = "select * from match_1 where username = ? and Status = 1";
		List<MatchModel> list = query(sql, new MatchMapper(), userName);
		return list.isEmpty() ? null : list;
	}

	// cập nhật lại trạng thái của trận đấu
	@Override
	public void update(Boolean status, Long id) {
		String sql = "update match_1 set Status = ? where id = ?";
		update(sql, status, id);
	}
	
}
