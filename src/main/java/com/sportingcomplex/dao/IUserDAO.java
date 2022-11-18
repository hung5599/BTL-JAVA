package com.sportingcomplex.dao;

import com.sportingcomplex.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel>{
	Long save(UserModel newUser);
	UserModel findOne(Long id);
	UserModel findOneByUserName(String userName);
}
