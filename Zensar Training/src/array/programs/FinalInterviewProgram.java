package array.programs;
import java.util.Arrays;

public class FinalInterviewProgram {
	
	public static int getResult(int[] arr)
	{
		
		int resultCount = 0;
		int count3 = 0;
		int count5 = 0;
		
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		int p4 = 0;
		
		int[] arr1 = new int[4];
		int[] arr2 = new int[4];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] >=3 && arr[i]< 5)
			{
				count3++;
			}
			else if(arr[i]>=5)
			{
				count5++;
			}
		}
		
//		System.out.println(count3+" "+count5);
		
		if(count3>3 || count5>2)
		{
			resultCount = 0;
		}
		else
		{
			for(int j=0;j<=arr.length;j++)
			{
			if(p1 == 0)
				{
					if(arr[j]<=2)
					{
						
						arr1[0] = arr[j];
						p1=1;
					}
				}
				
			if(p2 == 0)
				{
					if(arr[j]<=2)
					{
						arr1[1] = arr[j];
						p2=1;
					}
				}
				
			if(p3 == 0)
				{
					if(arr[j]<=2)
					{
						arr1[2] = arr[j];
						p3=1;
					}
				}
				
			if(p1 == 0)
				{
					if(arr[j]<=2)
					{
						arr1[3] = arr[j];
						p1=1;
					}
				}
				
			}
			
			for(int element:arr1)
			{
				System.out.println(element);
			}
		
		//------------------------
		
//		for(int k=arr.length-1;k<=0;k--)
//		{
//			if(p1 == 0)
//			{
//				if(arr[k]<=2)
//				{
//					
//					arr1[0] = arr[j];
//					p1=1;
//				}
//			}
//			
//			if(p2 == 0)
//			{
//				if(arr[j]<=2)
//				{
//					arr1[1] = arr[j];
//					p2=1;
//				}
//			}
//			
//			if(p3 == 0)
//			{
//				if(arr[j]<=2)
//				{
//					arr1[2] = arr[j];
//					p3=1;
//				}
//			}
//			
//			if(p1 == 0)
//			{
//				if(arr[j]<=2)
//				{
//					arr1[3] = arr[j];
//					p1=1;
//				}
//			}
//			
//		}
		
	}
		
	return resultCount;
	}

	public static void main(String[] args) {
		
		int[] arr = {2,3,2,5};
		
		
		FinalInterviewProgram.getResult(arr);
		
		

	}

}
