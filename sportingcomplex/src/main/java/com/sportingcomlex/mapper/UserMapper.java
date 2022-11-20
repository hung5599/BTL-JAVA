package com.sportingcomlex.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.sportingcomplex.model.RoleModel;
import com.sportingcomplex.model.UserModel;

public class UserMapper implements RowMapper<UserModel>{

	@Override
	public UserModel mapRow(ResultSet resultset) {
		try {
			UserModel user = new UserModel();
			user.setId(resultset.getLong("id"));
			user.setUserName(resultset.getString("username"));
			user.setPassWord(resultset.getString("password"));
			user.setRoleId(resultset.getLong("roleid"));
			user.setStatus(resultset.getInt("status"));
			try{
				user.setFullName(resultset.getString("fullname"));
				user.setAddress(resultset.getString("adress"));
				user.setPhonenumber(resultset.getString("phonenumber"));
				user.setDate_of_birth(resultset.getDate("dob"));
			}catch(Exception e){
				System.out.print(e.getMessage());
			}
		try {
			RoleModel role = new RoleModel();
			role.setCode(resultset.getString("code"));
			role.setName(resultset.getString("name"));
					user.setRole(role);
			}catch (Exception e){
				System.out.print(e.getMessage());
			}
			return user;
			} catch(SQLException e) {
				return null;
		}
	}
}
