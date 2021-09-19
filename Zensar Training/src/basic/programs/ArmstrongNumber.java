
//Program to check number is Armstrong or not
package basic.programs;
import java.util.Scanner;

public class ArmstrongNumber{

	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Number:");
			int number = sc.nextInt();
			int j=0,sum=0;
			int num=number;
			
			while(num>0)
			{
				int reminder=num%10;  	//to get last digit of number
				j=reminder;
				int cube=j*j*j;  		//to make a cube of digit
				sum = sum+cube;  
				num=num/10;
			}
			System.out.println(sum);
			
			if(sum==number)				//to check sum of cube of all digits is equal to number or not
				System.out.println("Armstrong Number");
			else
				System.out.println("Not an Armstrong Number");
		
		}

}
