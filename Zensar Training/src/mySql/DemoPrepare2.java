package mySql;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class DemoPrepare2 {

	public static void main(String[] args) throws SQLException {
		try (Connection con = DBConnect.getConnection();
				PreparedStatement pst = con.prepareStatement("select * from employee"))
		{
			ResultSet rs = pst.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
	}
}