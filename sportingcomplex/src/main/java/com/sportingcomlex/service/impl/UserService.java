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

	@Override
	public UserModel update(UserModel updateUser) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void delete(Long[] ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserModel findByUserName(String userName) {
		return userDAO.findByUserName(userName);
	}

	@Override
	public UserModel save(UserModel userModel) {
		Long userId = userDAO.save(userModel);
		return userDAO.findOne(userId);
	}

}
