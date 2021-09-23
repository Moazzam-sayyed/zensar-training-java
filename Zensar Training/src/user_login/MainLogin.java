package user_login;
import java.util.*;

public class MainLogin {
	 
	public static String username;
	public static String password;
	
	public MainLogin() {

	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static void main(String[] args) {
		
		MainAuthentiication ma = new MainAuthentiication();
		ma.authentication();
		System.out.println(username);
		System.out.println(password);
		
		String s1="admin";
		String s2="admin";
		
		if(s1.equals(username) && s2.equals(password))
		{
			System.out.println("loged in..");
		}
		else
		{
			System.out.println("fail");
		}
		
	}
	
}
