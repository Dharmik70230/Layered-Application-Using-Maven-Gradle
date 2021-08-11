package com.phoenix.services;

import java.sql.SQLException;
import java.util.List;


import com.phoenix.daos.LoginDaoimpl;
import com.phoenix.daos.LoginDaos;
import com.phoenix.data.User;
import com.phoenix.exceptions.ServiceException;
import com.phoenix.exceptions.UserAlreadyExistException;
import com.phoenix.exceptions.UserNotFoundExceptions;
/* 
* Auther : Dharmik Maru
* Date : 9/07/2021
* Version : 2.0
* Copyright : Sterlite Technologies
* 
* */
public class LoginServiceImpl implements LoginService {

	private LoginDaos loginDao;
	 	
	public LoginServiceImpl() {
		
		loginDao = new LoginDaoimpl();
	}

	@Override
	public List<User> findAll() throws ServiceException {
		// TODO Auto-generated method stub
		
		return loginDao.getAll();
		
	}

	@Override
	public User findUserByld(String username) throws UserNotFoundExceptions {
		User user = loginDao.getUserById(username);
		if(user!=null)
			return user;
		else
			throw new UserNotFoundExceptions("User Not Found");
	}

	@Override
	public void add(User user) throws UserAlreadyExistException {
		loginDao.insert(user);
	}

	@Override
	public void edit(User user) throws ServiceException {
		loginDao.update(user);
	}

	@Override
	public void remove(User user) throws ServiceException {
		loginDao.delete(user);
	}

	public String changePassword() throws SQLException {
		// TODO Auto-generated method stub
		User user = new User();
		String newPassword = null;
		user.setPassword(newPassword);
		loginDao.update(user);
		
		return "Password Updated Successfully";
	}

}
