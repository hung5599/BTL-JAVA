package com.sportingcomlex.mapper;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.sportingcomplex.model.UserModel;

public class UserMapper implements RowMapper<UserModel>{

	@Override
	public UserModel mapRow(ResultSet res) {
		try {
			UserModel userModel = new UserModel();
			userModel.setId(res.getLong("Id"));
			userModel.setUserName(res.getString("UserName"));
			userModel.setPassWord(res.getString("PassWord"));
			userModel.setFullName(res.getString("fullname"));
			userModel.setAddress(res.getString("Address"));
			userModel.setPhoneNumber(res.getString("PhoneNum"));
			userModel.setRoleId(res.getLong("RoleId"));
			userModel.setGender(res.getBoolean("Gender"));
			userModel.setDateOfBrth(res.getTimestamp("DOB"));
			userModel.setStatus(res.getBoolean("status"));
			return userModel;
		} catch(SQLException e) {
			return null;
		}
	}
	
}
