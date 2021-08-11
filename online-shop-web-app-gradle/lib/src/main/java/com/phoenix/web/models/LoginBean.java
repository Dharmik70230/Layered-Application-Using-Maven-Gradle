package com.phoenix.web.models;

import com.phoenix.data.User;
import com.phoenix.exceptions.UserNotFoundExceptions;
import com.phoenix.services.LoginService;
import com.phoenix.services.LoginServiceImpl;

/* 
 * Auther : Dharmik Maru
 * Date : 26/06/2021
 * Version : 2.0
 * Copyright : Sterlite Technologies
 * 
 * */
public class LoginBean {

	//data member
	private String username;
	private String password;
	

	// getters and setters method for data member
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isValid() throws UserNotFoundExceptions {
		
		
		/*
		 * // LoginService login = new LoginServiceImpl(); // User user; // try { //
		 * user = login.findUserByld(username); // } catch (UserNotFoundExceptions e) {
		 * // // TODO Auto-generated catch block // e.printStackTrace(); // } //
		 * if(username.equals(user.getUsername()) &&
		 * password.equals(user.getPassword())) { //
		 */		
		
		
		LoginService login = new LoginServiceImpl();
		User user = new User();
		try {
		user = login.findUserByld(username);
		}
		catch(UserNotFoundExceptions e) {
			e.printStackTrace();
		}
		if(user != null && username.equals(user.getUsername()) && password.equals(user.getPassword())) {
			return true;
		}else 
			return false;
		
	}
}
