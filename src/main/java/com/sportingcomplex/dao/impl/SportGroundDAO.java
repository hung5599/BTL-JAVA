package com.sportingcomplex.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.sportingcomlex.mapper.SportGroundMapper;
import com.sportingcomplex.dao.ISportGroundDAO;
import com.sportingcomplex.model.SportGroundModel;
import java.util.*;

public class SportGroundDAO extends AbstractDAO<SportGroundModel> implements ISportGroundDAO{

	// liệt kê các sân theo thể loại
	@Override
	public List<SportGroundModel> findGroundBycategoryId(Long categoryId) {
		String sql = "select * from san where categoryid = ?";
		return query(sql, new SportGroundMapper(), categoryId);
	}

	// lưu thêm sân vào database
	@Override
	public Long save(SportGroundModel groundModel) {
		String sql = "insert into san(categoryid, price, status)\n"
					+ "values(?, ?, ?)";
		return insert(sql, groundModel.getCategoryId(), groundModel.getPrice(), groundModel.isStatus());
	}

	// tìm kiếm 1 sân theo id sân
	@Override
	public SportGroundModel findOne(Long id) {
		String sql = "select * from san where id = ?";
		List<SportGroundModel>  groundList = query(sql, new SportGroundMapper(), id);
		if(groundList.isEmpty()) {
			return null;
		}
		return groundList.get(0);
	}

	// cập nhật lại các thuộc tính của sân 
	@Override
	public void update(SportGroundModel upDateGround) {
		String sql = "update san set categoryid = ?,\n"
				+ " price = ?, status = ? where id = ?";
		update(sql, upDateGround.getCategoryId(), upDateGround.getPrice(), upDateGround.isStatus(), upDateGround.getId());
	}

	// xóa sân theo id
	@Override
	public void delete(Long id) {
		String sql = "delete from san where id = ?";
		update(sql, id);
	}
}
