package com.phoenix.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/* 
* Auther : Dharmik Maru
* Date : 6/07/2021
* Version : 1.0
* Copyright : Sterlite Technologies
* 
* */
public class DbConfig {

	public static Connection getConnection(String jdbcDriver, String jdbcUrl,
			String username, String password)
			throws SQLException, ClassNotFoundException {
		Class.forName(jdbcDriver);
		System.out.println("JDBC Connection Successfully");
		return DriverManager.getConnection(jdbcUrl, username, password);

	}

}
