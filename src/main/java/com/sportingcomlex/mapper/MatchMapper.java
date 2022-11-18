package com.sportingcomlex.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sportingcomplex.model.MatchModel;

public class MatchMapper implements RowMapper<MatchModel>{

	@Override
	public MatchModel mapRow(ResultSet res) {
		try {
			MatchModel matchModel = new MatchModel();
			matchModel.setId(res.getLong("Id"));
			
			matchModel.setId_San(res.getLong("Id_Sân"));
			
			matchModel.setId_user(res.getLong("id_user"));
			
			matchModel.setTime_Start(res.getString("Time_Start"));
			
			matchModel.setUserName(res.getString("username"));
			
			matchModel.setStatus(res.getBoolean("Status"));
			
			matchModel.setDateOpen(res.getDate("Date_Open"));
			
			matchModel.setCategoryId(res.getLong("categoryid"));
			
			matchModel.setPrice(res.getFloat("price"));
			return matchModel;
		} catch(SQLException e) {
			return null;
		}
	}
}
