package com.sportingcomplex.dao;

import com.sportingcomplex.model.UsModel;
import com.sportingcomplex.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel>{
	UserModel findByUserNameAndPassword(String userName, String passWord);
	UserModel findByUserName(String userName);
	Long save(UserModel userModel);
	UserModel findOne(Long id);
}
