package com.sportingcomlex.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sportingcomplex.model.SportGroundModel;

public class SportGroundMapper implements RowMapper<SportGroundModel>{

	@Override
	public SportGroundModel mapRow(ResultSet resultset) {
		try {
			SportGroundModel sportGround = new SportGroundModel();
			sportGround.setId(resultset.getLong("Id"));
			sportGround.setCategoryId(resultset.getLong("categoryid"));
			sportGround.setName(resultset.getString("name"));
			sportGround.setDateOpen(resultset.getTimestamp("Date_Open"));
			sportGround.setPrice(resultset.getFloat("Price"));
			sportGround.setStatus(resultset.getBoolean("Status"));
			sportGround.setTime(resultset.getTimestamp("Time"));
			return sportGround;
		} catch(SQLException e) {
			return null;
		}
	}
}
