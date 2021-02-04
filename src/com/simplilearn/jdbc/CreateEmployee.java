package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateEmployee {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stm = null;
		
		try{
		conn = DBConnection.initConnection();
		stm = conn.createStatement();
		
		String query ="INSERT INTO employees(id, first_name, last_name, email, department, salary) values (5, 'Charlie', 'Walker', 'charlie.walker@gmail.com', 'Accounts', '130000.49')";
		int count = stm.executeUpdate(query);
		System.out.println("ROWS UPDATED" + count);
		
		     
		

	}catch (SQLException e) {
		System.out.println("Db Connection failed!"+ e.getMessage());
	} 


	}

}
