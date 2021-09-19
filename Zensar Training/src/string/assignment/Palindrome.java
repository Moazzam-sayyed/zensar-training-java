package string.assignment;
import java.util.Scanner;

public class Palindrome {
	
	public String reverseString(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    return sb.toString();  
	} 

	public static void main(String[] args) {
		

		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String:");
		String newString = sc.next();
		Palindrome palindrome =new Palindrome();
		String reverseString = palindrome.reverseString(newString);
		
		if(newString.equals(reverseString))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
}
