package exception_handling;

import java.util.InputMismatchException;
import java.util.*;

public class TryCatch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter number:");
			int n = sc.nextInt();
			
			System.out.println("Square: "+n*n);
		}
		catch(InputMismatchException e) {
			System.out.println("Enter number "+e);
		}
	}
}
