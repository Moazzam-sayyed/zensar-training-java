package array.programs;
import java.util.*;

public class ArrayMax {
	
	public static void displayArray(int[] arr)
	{
		System.out.println("Your array");
		int max = arr[0];
		for(int i =0 ; i<arr.length; i++)
		{
			System.out.print(" "+arr[i]);
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println();
		System.out.println("Max:"+max);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i =0 ; i<arr.length; i++)
		{
			System.out.println("Enter number");
			int num = sc.nextInt();
			arr[i]=num;
		}
		ArrayMax.displayArray(arr);
	
	}
	

}
