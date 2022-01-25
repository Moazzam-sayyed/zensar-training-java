package array.programs;

public class Bubble_sort {
	
	public  int[] sort(int[] arr)
	{

		int temp;
		int n = arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=1;j<n-1;j++)
			{
				if(arr[j-1]>arr[j])
				{
					//swap
					temp= arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
	
		return arr;
	}

	public static void main(String[] args) {
		
		Bubble_sort b = new Bubble_sort();
		int[] arr = {12,6,45,2,8,74,3,4,55};
		int n = arr.length;
		b.sort(arr);
		
		for(int k=0;k<n;k++)
		{
			System.out.print(arr[k]+" ");
		}
	}

}
