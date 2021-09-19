package string.assignment;
import java.util.*;

public class CheckDigitNumber {
	

	
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check digit in");
		int number = sc.nextInt();
		
		if(number<0)
		{
			System.out.println("number is negative");
		}
		else
		{
			System.out.println("Enter digit to find");
			int digit = sc.nextInt();
			System.out.println("Given Digit is:"+isDigit(number,digit));
			}
		}
	
	public static boolean isDigit(int number,int digit)
	{
		//boolean flag = false;
		while(number!=0)
		{
			int num = number %10;
			if(num == digit)
			{
				return true;
			}
			else
			{
				number = number/10;
			}
		}
		return false;
	}
	
}
