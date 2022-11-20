package com.sportingcomlex.service.impl;

import javax.inject.Inject;

import com.sportingcomlex.service.IUserService;
import com.sportingcomplex.dao.IUserDAO;
import com.sportingcomplex.model.UsModel;
import com.sportingcomplex.model.UserModel;

public class UserService implements IUserService{
	@Inject
	private IUserDAO userDao;

	@Override
	public UsModel save(UsModel newModel) {
		return null;
	}

	@Override
	public UserModel findByUserNameAndPassword(String userName, String passWord) {
		return userDao.findByUserNameAndPassword(userName, passWord);
	}

	@Override
	public UserModel findByUserName(String userName) {
		return userDao.findByUserName(userName);
	}

	@Override
	public UserModel update(UserModel updateUser) {
		// TODO Auto-generated method stub
		return null;
	}
}
