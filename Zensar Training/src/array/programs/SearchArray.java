package array.programs;

public class SearchArray {
	
	public static void main(String[] args) {
		
		int[] arr = {5,4,3,6};
		int searchElement = 7;
		int flag = 0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==searchElement)
			{
				System.out.println("Array element fount at "+i);
				flag=1;
				break;
			}
		}
		if(flag!=1)
		{
			System.out.println("Not Found!!!..");
		}
	}

}
