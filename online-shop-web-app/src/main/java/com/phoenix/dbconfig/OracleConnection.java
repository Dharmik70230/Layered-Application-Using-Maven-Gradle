package com.phoenix.dbconfig;

import java.sql.Connection;
import java.sql.SQLException;
/* 
* Auther : Dharmik Maru
* Date : 6/07/2021
* Version : 1.0
* Copyright : Sterlite Technologies
* 
* */
public class OracleConnection {
	
	public static Connection getOracleConnection() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String jdbcDriver = "oracle.jdbc.driver.OracleDriver";
		String jdbcUrl = "jdbc:oracle:thin:@localhost:1521:XE";
		String dbUser = "hr";
		String dbPassword = "hr";
		return DbConfig.getConnection(jdbcDriver, jdbcUrl, dbUser, dbPassword);
		
	}


}
