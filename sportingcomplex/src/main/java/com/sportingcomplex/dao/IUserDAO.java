package com.sportingcomplex.dao;

import java.util.*;

import com.sportingcomplex.model.UserModel;
public interface IUserDAO extends GenericDAO<UserModel>{
	UserModel findByUserNameAndPassword(String userName, String password);
}
