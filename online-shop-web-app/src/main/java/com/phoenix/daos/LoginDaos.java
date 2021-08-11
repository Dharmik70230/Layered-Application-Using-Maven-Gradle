package com.phoenix.daos;

import java.util.List;

import com.phoenix.data.User;
/* 
* Auther : Dharmik Maru
* Date : 9/07/2021
* Version : 2.0
* Copyright : Sterlite Technologies
* 
* */
public interface LoginDaos {

	List<User> getAll() ; 
	User getUserById(String username) ;
	void insert(User user) ;
	void update(User user) ;
	void delete(User user) ;
	
}
