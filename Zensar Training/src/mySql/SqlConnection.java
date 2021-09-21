package mySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;

public class SqlConnection {
	

	public static void main(String[] args) {
		Connection con=null;     
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  //Load driver
			
			//establish connection
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test_databse","root","root");  
			Statement st = con.createStatement();
			int i = st.executeUpdate("insert into employee values(1,'moazzam',1000)");
			System.out.println("Record added sucesfully:"+i);
		}
		catch(ClassNotFoundException e)    //to catch connection error
		{
			e.printStackTrace();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(con!=null);
					con.close();
			} catch (SQLException e) {
			}
		}
	}

}
