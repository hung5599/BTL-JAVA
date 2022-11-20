package com.sportingcomlex.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sportingcomplex.model.UsModel;

public class UsMapper implements RowMapper<UsModel>{

	@Override
	public UsModel mapRow(ResultSet res) {
		UsModel us = new UsModel();
		try {
			us.setId(res.getLong("id"));
			us.setUserName(res.getString("username"));
			us.setFullName(res.getString("fullname"));
			us.setPhoneNumber(res.getString("phonenumber"));
			us.setAddress(res.getString("address"));
			return us;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	
}
