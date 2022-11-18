package com.sportingcomplex.dao.impl;

import com.sportingcomlex.mapper.UserMapper;
import com.sportingcomplex.dao.IUserDAO;
import com.sportingcomplex.model.UserModel;
import java.util.*;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO{

	@Override
	public Long save(UserModel newUser) {
		String sql = "insert into Users_1(UserName, PassWord, gender, status)\n"
				+ "values(?, ?, ?, ?)";
		return insert(sql, newUser.getUserName(), newUser.getPassWord(), newUser.isGender(), newUser.isStatus());
	}

	@Override
	public UserModel findOne(Long id) {
		String sql = "select * from Users_1 where id = ?";
		List<UserModel> userModels = query(sql, new UserMapper(), id);
		return userModels.isEmpty() ? null : userModels.get(0);
	}

	@Override
	public UserModel findOneByUserName(String userName) {
		String sql = "select * from Users_1 where UserName = ?";
		List<UserModel> list = query(sql, new UserMapper(), userName);
		if(list.isEmpty()) {
			return null;
		}
		return list.get(0);
	}
}
