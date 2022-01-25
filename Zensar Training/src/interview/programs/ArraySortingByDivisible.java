package interview.programs;

import java.util.ArrayList;


public class ArraySortingByDivisible {

	public static void main(String[] args) {
		
		int array[] = {2,4,5,3,45,23,67,54,8,10};  //Given Array
		
		ArrayList<Integer> al = new ArrayList<>();  //ArrayList to store number which is not divisible by zero
		ArrayList<Integer> al2 = new ArrayList<>(); //ArrayList to store number which is not divisible by zero
		


		for(int i=0;i<array.length;i++)
		{
			if(array[i]%5!=0)
			{
				al.add(array[i]);
			}
			else
			{
				al2.add(array[i]);
			}
		}

		for(int  x:al)    
		{
			System.out.print(x+" "); //print numbers which is not divisible by 5
		}
		
		for(int y:al2)
		{
			System.out.print(y+" ");  //print numbers which is divisible by 5
		}
		
	}

}
