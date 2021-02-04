import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConectionTest {

	public static void main(String[] args) {
	 String url = "jdbc:mysql://localhost:3306/emsystem";
	 String user = "root";
	 String password = "root";
	 String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
		
		try {
			Class.forName(JDBC_DRIVER);
			
			Connection conn= DriverManager.getConnection(url, user, password);
			System.out.println("Db Connection Successful!");
			
			
			
		}catch (SQLException e) {
			System.out.println("Db Connection failed!");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}finally {
		}

	}

}
