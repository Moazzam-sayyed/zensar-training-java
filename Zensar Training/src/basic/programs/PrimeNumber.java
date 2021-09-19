package basic.programs;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter number");
		int number;
		number = sc.nextInt();
		int flag = 0;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = 0;
			} else {
				flag = 1;
			}

		}
		if (flag == 0)
			System.out.println("Number is not a prime number");
		else
			System.out.println("Number is a prime Number");
	}

}


