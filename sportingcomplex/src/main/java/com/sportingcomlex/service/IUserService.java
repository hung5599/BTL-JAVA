package com.sportingcomlex.service;

import com.sportingcomplex.model.UserModel;

public interface IUserService {
	UserModel findByUserNameAndPassword(String userName, String passWord);
	UserModel findByUserName(String userName);
	UserModel save(UserModel userModel);
	UserModel update(UserModel updateUser);
	void delete(Long[] ids);
}
