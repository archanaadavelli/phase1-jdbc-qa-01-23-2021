package com.simplilearn.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteEmployeeTest {

	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		Statement stm = null;
		try{
			 conn = DBConnection.initConnection();
			 stm = conn.createStatement();
			String query = "delete from employees where id = 5";
			int rowAffected = stm.executeUpdate(query);
			System.out.println("number of records deleted" + rowAffected);
			

	}catch (Exception  e) {
		e.printStackTrace();
	}finally {
		if (stm != null){
			stm.close();
		} if (conn != null)
		{
			conn.close ();
 		}
	}
	}

}
