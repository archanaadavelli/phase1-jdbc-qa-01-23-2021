package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployeeTest {

	public static void main(String[] args) {
		 String url = "jdbc:mysql://localhost:3306/emsystem";
		 String user = "root";
		 String password = "root";
		 String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
			
			try {
				Class.forName(JDBC_DRIVER);
				
				Connection conn= DriverManager.getConnection(url, user, password);
				Statement stm = conn.createStatement();
				
				String query ="Select * from employees";
				ResultSet res = stm.executeQuery(query);
				
				while (res.next()) {
					System.out.println
					(res.getInt("id") + " " +
				     res.getString("first_name") + " " +
					 res.getString("last_name") + " " +
				     res.getString("email") + " " +
				     res.getString("department") + " " +
				     res.getDouble("salary"));
				     
				}
				
				
				
				
				
			}catch (SQLException e) {
				System.out.println("Db Connection failed!");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}finally {

	}

}
}
