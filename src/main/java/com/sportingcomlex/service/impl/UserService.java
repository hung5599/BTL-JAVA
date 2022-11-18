package com.sportingcomlex.service.impl;

import javax.inject.Inject;

import com.sportingcomlex.service.IUserService;
import com.sportingcomplex.dao.IUserDAO;
import com.sportingcomplex.model.UserModel;

public class UserService implements IUserService{
	@Inject
	private IUserDAO userDao;

	@Override
	public UserModel save(UserModel newModel) {
		Long idUser = userDao.save(newModel);
		return userDao.findOne(idUser);
	}
}
