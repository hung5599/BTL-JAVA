package com.sportingcomlex.service.impl;

import javax.inject.Inject;

import com.sportingcomlex.service.IUserService;
import com.sportingcomplex.dao.IUserDAO;
import com.sportingcomplex.model.UserModel;

public class UserService implements IUserService{

	@Inject
	private IUserDAO userDAO;
	@Override
	public UserModel findByUserNameAndPassword(String userName, String passWord) {
		return userDAO.findByUserNameAndPassword(userName, passWord);
	}

}
