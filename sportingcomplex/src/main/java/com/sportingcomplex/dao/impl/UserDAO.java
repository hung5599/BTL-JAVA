package com.sportingcomplex.dao.impl;

import java.util.List;

import com.sportingcomlex.mapper.UserMapper;
import com.sportingcomplex.dao.IUserDAO;
import com.sportingcomplex.model.UserModel;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {

	@Override
	public UserModel findByUserNameAndPassword(String userName, String passWord) {
		StringBuilder sql = new StringBuilder("SELECT * FROM Users AS u");
		sql.append(" INNER JOIN role AS r ON r.id = u.RoleId");
		sql.append(" WHERE UserName = ? AND PassWord = ?");
		List<UserModel> users = query(sql.toString(), new UserMapper(), userName, passWord);
		return users.isEmpty() ? null : users.get(0);
	}

}
