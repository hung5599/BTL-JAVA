package com.sportingcomlex.service;

import com.sportingcomplex.model.UserModel;

public interface IUserService {
	UserModel findByUserNameAndPassword(String userName, String passWord);
}
