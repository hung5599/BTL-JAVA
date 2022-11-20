package com.sportingcomlex.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sportingcomplex.model.MatchModel;

public class MatchMapper implements RowMapper<MatchModel>{

	@Override
	public MatchModel mapRow(ResultSet res) {
		try {
			MatchModel matchModel = new MatchModel();
			matchModel.setId(res.getLong("id"));
			matchModel.setCategoryId(res.getLong("categoryid"));
			matchModel.setDateOpen(res.getDate("date_open"));
			matchModel.setId_San(res.getLong("id_san"));
			matchModel.setPrice(res.getFloat("price"));
			matchModel.setTime_Start(res.getString("time"));
			matchModel.setUserName(res.getString("username"));
			matchModel.setStatus(res.getBoolean("status"));
			return matchModel;
		} catch(SQLException e) {
			return null;
		}
	}
}
