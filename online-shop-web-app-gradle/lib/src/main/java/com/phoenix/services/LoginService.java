package com.phoenix.services;

import java.sql.SQLException;
import java.util.List;

import com.phoenix.data.User;
import com.phoenix.exceptions.ServiceException;
import com.phoenix.exceptions.UserAlreadyExistException;
import com.phoenix.exceptions.UserNotFoundExceptions;
/* 
* Auther : Dharmik Maru
* Date : 6/07/2021
* Version : 1.0
* Copyright : Sterlite Technologies
* 
* */
public interface LoginService {
	
	List<User> findAll() throws ServiceException;
	User findUserByld(String username) throws UserNotFoundExceptions;
	void add(User user) throws UserAlreadyExistException;
	void edit(User user) throws ServiceException;
	void remove(User user) throws ServiceException;
	String changePassword() throws ServiceException, SQLException;

}
