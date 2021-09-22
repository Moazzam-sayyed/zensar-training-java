package mySql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.sun.source.tree.CatchTree;

public class DemoPrepare {
	public static void main(String[] args) throws SQLException {
		//try with resource
		try (Connection con = DBConnect.getConnection();
				PreparedStatement pst = con.prepareStatement("insert into employee(empid,empname,salary) value(?,?,?)");
				Scanner sc= new Scanner(System.in))
		{
			System.out.println("Enter empid,ename,salary");
			int id =sc.nextInt();
			String name = sc.next();
			int salary1= sc.nextInt();
			
			pst.setInt(1,id);                   
			pst.setString(2,name);
			pst.setInt(3,salary1);
			
			int i=pst.executeUpdate();
			
			System.out.println("Record added succesfully.."+i);
		}
	}               
}
