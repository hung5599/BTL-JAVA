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

	@Override
	public List<SportGroundModel> findGroundBycategoryId(Long categoryId) {
		String sql = "select * from Sân1 where categoryid = ?";
		return query(sql, new SportGroundMapper(), categoryId);
	}

	@Override
	public Long save(SportGroundModel groundModel) {
		String sql = "insert into Sân1(categoryid, name, Date_open, Price, Status)\n"
					+ "values(?, ?, ?, ?, ?)";
		return insert(sql, groundModel.getCategoryId(), groundModel.getName(), groundModel.getDateOpen(), groundModel.getPrice(), groundModel.isStatus());
	}

	@Override
	public SportGroundModel findOne(Long id) {
		String sql = "select * from Sân1 where id = ?";
		List<SportGroundModel>  groundList = query(sql, new SportGroundMapper(), id);
		if(groundList.isEmpty()) {
			return null;
		}
		return groundList.get(0);
	}

	@Override
	public void update(SportGroundModel upDateGround) {
		String sql = "update Sân1 set categoryid = ?, name = ?,\n"
				+ "Date_open = ?, Price = ?, Status = ? where id = ?";
		update(sql, upDateGround.getCategoryId(), upDateGround.getName(), upDateGround.getPrice(), upDateGround.isStatus(), upDateGround.getId());
	}

	@Override
	public void delete(Long id) {
		String sql = "delete from Sân1 where id = ?";
		update(sql, id);
	}
}
