package com.sportingcomplex.dao.impl;

import java.sql.Date;
import java.util.*;

import com.sportingcomlex.mapper.BillMapper;
import com.sportingcomplex.dao.IBillDAO;
import com.sportingcomplex.model.BillModel;


public class BillDAO extends AbstractDAO<BillModel> implements IBillDAO{

	/// lưu hóa đơn mỗi khi có 1 trận đấu được đặt thành công
	// Long id_match, String userName, Date date, Float total, String type


	// xóa hóa đơn theo id trận đấu
	@Override
	public void delete(Long id_match) {
		String sql = "delete from bill where id_match = ?";
		update(sql, id_match);
	}

	// tìm kiếm 1 hóa đơn theo id trậ đấu
	@Override
	public BillModel findOneByIdMatch(Long idMatch) {
		String sql = "select * from bill where id_match ";
		List<BillModel> list = query(sql, new BillMapper(), idMatch);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public Long save(Long id_match, Date date, Float total, String userName, String type) {
		String sql = "insert into bill (id_match, date, total, username, type) values (?, ?, ?, ?, ?)";
		return insert(sql, id_match, date, total, userName, type);
	}

	@Override
	public BillModel findOneById(Long id) {
		String sql = "select * from bill where id = ? ";
		List<BillModel> list = query(sql, new BillMapper(), id);
		if(list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}

	
	
}