package com.sportingcomplex.dao.impl;

import java.util.List;

import com.sportingcomlex.mapper.UserMapper;
import com.sportingcomplex.dao.IUserDAO;
import com.sportingcomplex.model.UserModel;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {

	@Override
	public UserModel findByUserNameAndPassword(String userName, String password) {
		String sql = "SELECT * FROM User AS u INNER JOIN role AS r ON r.id = u.Roleid WHERE UserName = ? AND PassWord =?";
		List<UserModel> users = query(sql, new UserMapper(), userName, password);
		return users.isEmpty() ? null : users.get(0);
	}

}
