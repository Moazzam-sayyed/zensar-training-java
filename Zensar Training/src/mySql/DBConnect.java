package mySql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
	
	public static String url = "jdbc:mysql://localhost:3306/test_databse";
	public static String username = "root";
	public static String password = "root";
	
	public static Connection getConnection()
	{
		Connection con =null;
		try {
			con = DriverManager.getConnection(url,username,password);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}
