package com.sportingcomplex.dao.impl;

import java.util.List;

import com.sportingcomlex.mapper.UserMapper;
import com.sportingcomplex.dao.IUserDAO;
import com.sportingcomplex.model.UserModel;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {

	@Override
	public UserModel findByUserNameAndPassword(String userName, String passWord) {
		String sql = "SELECT * FROM users"
					+" INNER JOIN role ON role.id = users.roleid"
					+" WHERE username = ? AND password = ?";
		List<UserModel> users = query(sql, new UserMapper(), userName, passWord);
		if(users.isEmpty()) {
			return null;
		}
		return users.get(0);
	}

	@Override
	public Long save(UserModel userModel) {
		String sql = "insert into users(username, password, fullname, roleid, status)\n"
				+ "values(?, ?, ?, ?, ?)";
	return insert(sql, userModel.getUserName(), userModel.getPassWord(), userModel.getFullName(),2,1);
	}

	@Override
	public UserModel findByUserName(String userName) {
		String sql = "SELECT * FROM users"
				+" INNER JOIN role  ON role.id = users.roleid"
				+" WHERE username = ?";
		List<UserModel> users = query(sql, new UserMapper(), userName);
		if(users.isEmpty()) {
			return null;
		}
		return users.get(0);
	}

	@Override
	public UserModel findOne(Long id) {
		String sql = "select * from users where id = ?";
		List<UserModel>  userList = query(sql, new UserMapper(), id);
		return userList.isEmpty() ? null : userList.get(0);
	}
}
