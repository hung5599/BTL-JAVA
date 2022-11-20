package com.sportingcomlex.service;

import com.sportingcomplex.model.UsModel;
import com.sportingcomplex.model.UserModel;

public interface IUserService {
	UsModel save(UsModel newModel);
	UserModel findByUserNameAndPassword(String userName, String passWord);
	UserModel findByUserName(String userName);
	UserModel update(UserModel updateUser);
}
