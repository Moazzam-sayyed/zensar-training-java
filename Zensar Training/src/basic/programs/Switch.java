package basic.programs;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Tow number");
		int num1,num2,choice;
		num1=sc.nextInt();
		num2=sc.nextInt();
		System.out.println("Enter Your choice");
		System.out.println("1-Addition 2-Substraction 3-Multiplication 4-Division 5-Power");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1:
			System.out.println("Additon:"+num1+num2);
			break;
		case 2:
			System.out.println("Substraction:"+(num1-num2));
			break;		
		case 3:
			System.out.println("Multiplication:"+num1*num2);
			break;
		case 4:
			System.out.println("Division:"+num1/num2);
			break;
		case 5:
			System.out.println("Power:"+Math.pow(num1, num2));
			break;
		}
	
	
}


}
