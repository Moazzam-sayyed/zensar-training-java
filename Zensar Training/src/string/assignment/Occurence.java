package string.assignment;
import java.util.Scanner;
import java.util.Arrays;

public class Occurence {
	
	public static int findOccurence(String mainString,String word)
	{
		int count=0;
		int i=0;
		String strArray[] = mainString.split(" ");
		for(i=0; i<strArray.length ; i++)
		{
			if(word.equals(strArray[i]))
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String mainString = sc.nextLine();
		System.out.println("Enter word to find");
		String word = sc.next();
		System.out.println("Occurence of word ="+findOccurence(mainString, word));
	
		

		
		
		
		

	}

}
