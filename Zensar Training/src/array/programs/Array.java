package array.programs;
import java.util.*;
public class Array {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter Number");
		  
		  int arr[] = new int[5];
		  for(int i=0;i<arr.length; i++)
		  {
			  arr[i]=sc.nextInt();
			
		  }
		  System.out.println("Array element:");
		  for(int j = 0 ; j<arr.length ; j++)
		  {
			 if(arr[j]%2==1)
			 {
				 System.out.println("odd number"+arr[j]);
			 }
		  }
		  
	}
}
