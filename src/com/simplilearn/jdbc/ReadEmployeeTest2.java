package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadEmployeeTest2 {

	public static void main(String[] args) {
		 
		try {
			Connection conn =DBConnection.initConnection();
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
			} 

	}

}
