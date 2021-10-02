package array.programs;

import java.util.Arrays;
public class CountTwoDigitnumber {

	public static void main(String[] args) {
		
		int[] arr = {11,2,43,94,5};
		int count=0;
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>9 && arr[i]<100)
			{
				count=count+1;
			}
		}
		System.out.println(count);
	}
}
