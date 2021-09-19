package array.programs;
import java.util.*;

public class CustomArray {

	public static void main(String[] args) {
		Student[] arr= new Student[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<arr.length; i++)
		{
			arr[i] = new Student();
			
			System.out.println("Enter Id Name Percent");
			arr[i].setId(sc.nextInt());
			arr[i].setName(sc.next());
			arr[i].setPercent(sc.nextInt());
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i].percent >75)
			{
				System.out.println(arr[i].name);
			}
		}
	}
}
