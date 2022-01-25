package string.assignment;
import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
	
	public static void isAnagram(String firstString,String secondString)
	{
		String s1 = firstString.replaceAll("\\s","");  //to remove all space
		String s2 = secondString.replaceAll("\\s", "");
		
		char[] charArray1 = firstString.toLowerCase().toCharArray();		//Convert string into array of character
		char[] charArray2 = secondString.toLowerCase().toCharArray();
		
		
		if(charArray1.length!=charArray2.length)
		{
			System.out.println(firstString+" and "+secondString+" are not anagram");	
		}
		else
		{
			Arrays.sort(charArray1);    	//sort array of type char 
			Arrays.sort(charArray2); 
			
			if(Arrays.equals(charArray1, charArray2))      //compare both arrays
			{
				System.out.println(firstString+" and "+secondString+" are anagram ");
			}
			else
			{
				System.out.println(firstString+" and "+secondString+" are not anagram");
			}
		}
	}
	

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first String");
		String firstString = sc.nextLine();
		System.out.println("Enter second String");
		String secondString = sc.nextLine();
		
		Anagram.isAnagram(firstString, secondString);
	}
}

