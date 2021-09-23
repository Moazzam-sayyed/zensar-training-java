package user_login;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import mySql.DBConnect;

public class MainAuthentiication {

	public boolean authentication()
	{
		try (Connection con = DBConnect.getConnection();
				PreparedStatement pst = con.prepareStatement("select * from user"))
		{
		 ResultSet rs= pst.executeQuery(); 
		 while(rs.next())
		 {
			 MainLogin ml = new MainLogin();
			 ml.setUsername(rs.getString(2));
			 ml.setPassword(rs.getString(3));
		 }
		 return true;
		}
		catch (SQLException e) {
		// TODO: handle exception
	}
		return false;
	}
	
}
