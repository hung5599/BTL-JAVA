package com.sportingcomlex.service.impl;

import javax.inject.Inject;

import com.sportingcomlex.service.IUserService;
import com.sportingcomplex.dao.IUserDAO;
import com.sportingcomplex.dao.impl.UserDAO;
import com.sportingcomplex.model.UserModel;

public class UserService implements IUserService{

	@Inject
	private IUserDAO userDAO;
	
	// tim thong tin de dang nhap
	@Override
	public UserModel findByUserNameAndPassword(String userName, String passWord) {
		return userDAO.findByUserNameAndPassword(userName, passWord);
	}

	// tim kiem theo username
	@Override
	public UserModel findByUserName(String userName) {
		return userDAO.findByUserName(userName);
	}

	// luu thong tin dang ky
	@Override
	public UserModel save(UserModel userModel) {
		Long userId = userDAO.save(userModel);
		return userDAO.findOne(userId);
	}

}