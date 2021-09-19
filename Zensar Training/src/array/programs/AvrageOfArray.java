package array.programs;
import java.util.*;

public class AvrageOfArray {
	
//	public  int[] insertArray()
//	{
//		
//		return newArray;
//	}
	
	public void displayArray(int[] newArray)
	{
		//this.newArray = newArray;
		
		System.out.println("Your Array:");
		
		for(int i=0;i<newArray.length;i++)
		{
			System.out.print(" "+newArray[i]);
		}
	}
	
	public static void findAvrage(int[] newArray)
	{
		int sum = 0;
		float avg;
		for(int i=0;i<newArray.length;i++)
		{
			sum = sum+newArray[i];
		}
		avg = sum/newArray.length;
		System.out.println();
		System.out.println(newArray.length);
		System.out.println("Avrage of Array: "+avg);

	}

	public static void main(String[] args) {
	
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int arraySize = sc.nextInt();
		int[] newArray = new int[arraySize];
		
		int n = newArray.length;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter "+(i+1)+" Element");
			newArray[i] = sc.nextInt();
		}
		
		AvrageOfArray avg = new AvrageOfArray();
		avg.displayArray(newArray);
		AvrageOfArray.findAvrage(newArray);
		
	}

}
