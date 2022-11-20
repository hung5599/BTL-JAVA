package com.sportingcomlex.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sportingcomplex.model.SportGroundModel;

public class SportGroundMapper implements RowMapper<SportGroundModel>{

	@Override
	public SportGroundModel mapRow(ResultSet resultset) {
		try {
			SportGroundModel sportGround = new SportGroundModel();
			sportGround.setId(resultset.getLong("id"));
			sportGround.setCategoryId(resultset.getLong("categoryid"));
			sportGround.setPrice(resultset.getFloat("price"));
			sportGround.setStatus(resultset.getBoolean("status"));
			return sportGround;
		} catch(SQLException e) {
			return null;
		}
	}
}