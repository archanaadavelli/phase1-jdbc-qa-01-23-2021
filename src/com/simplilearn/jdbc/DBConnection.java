package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	 static final String url = "jdbc:mysql://localhost:3306/emsystem";
	 static final String user = "root";
	 static final String password = "root";
	 static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	 
	 public static Connection initConnection() {
		 Connection conn = null;
		 
		 try {
				
				conn= DriverManager.getConnection(url, user, password);
				System.out.println("Db Connection Successful!");
				
				
				
			}catch (SQLException e) {
				System.out.println("Db Connection failed!");
			}
		 return conn;
		 
	 }
}
