package com.sportingcomplex.dao.impl;

import java.util.List;

import com.sportingcomlex.mapper.UserMapper;
import com.sportingcomplex.dao.IUserDAO;
import com.sportingcomplex.model.UserModel;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {

	// dang nhap
	@Override
	public UserModel findByUserNameAndPassword(String userName, String passWord) {
		String sql = "select * from users inner join role on role.id = users.roleid where username = ? and password = ?";
		List<UserModel> users = query(sql, new UserMapper(), userName, passWord);
		if(users.isEmpty()) {
			return null;
		}
		return users.get(0);
	}

	// luu thong tin dang ky tai khoan
	@Override
	public Long save(UserModel userModel) {
		String sql = "insert into users(username, password, roleid)\n"
				+ "values(?, ?, ?)";
	return insert(sql, userModel.getUserName(), userModel.getPassWord(),2);
	}

	// tim theo username de dang ky
	@Override
	public UserModel findByUserName(String userName) {
		String sql = "select * from users inner join role on role.id = users.roleid where username = ?";
		List<UserModel> users = query(sql, new UserMapper(), userName);
		if(users.isEmpty()) {
			return null;
		}
		return users.get(0);	
	}

	// tim user theo id
	@Override
	public UserModel findOne(Long id) {
		String sql = "select * from users where id = ?";
		List<UserModel>  list = query(sql, new UserMapper(), id);
		return list.isEmpty() ? null : list.get(0);
	}
}