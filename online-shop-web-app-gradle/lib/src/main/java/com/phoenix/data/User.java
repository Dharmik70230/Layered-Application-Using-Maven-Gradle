package com.phoenix.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/* 
* Auther : Dharmik Maru
* Date : 6/07/2021
* Version : 2.0
* Copyright : Sterlite Technologies
* 
* */

// Value object Class -Java Bean Class -POJO
@Entity
@Table(name = "LOGIN")
public class User {

	@Id
	public String username;
	public String password;
	
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
}
