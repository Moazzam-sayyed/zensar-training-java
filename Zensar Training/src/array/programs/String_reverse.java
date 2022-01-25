package array.programs;
import java.util.Scanner;

public class String_reverse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("enter no. of string");
		int n = sc.nextInt();
		
		String s3="";
		
		for(int j=0;j<=n;j++)
		{
			System.out.println("Enter String:");
			String s1 = sc.next();
			s3= s3+s1;
	
		}
		
		String s4="";
		
		
		
		for(int i=s3.length()-1;i>=0;i--)
		{
			s4=s4+s3.charAt(i);
		}
		
		System.out.println(s4);
		
	}



}





















 










