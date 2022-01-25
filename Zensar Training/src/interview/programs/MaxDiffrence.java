
//Program to find the maximum index difference between two same element from array
package interview.programs;

public class MaxDiffrence {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,5,2,6,8,2,9,4,2,5};
		int n = 2;
		
		int firstIndex=0;
		int LastIndex=0;
		int count = 0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{

				if(count==0)
				{
					firstIndex=i;
					count++;
				}
				else
				{
					
					LastIndex = i;
				}
			}
		}
		
		int maxDifference = LastIndex-firstIndex;
		System.out.println("The maximum Diffrence = "+maxDifference);
		

	}

}
