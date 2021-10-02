package string.assignment;

import java.util.ArrayList;
import java.util.List;


public class MatchChar {		//Program to find same character of string at same index from string array
								//Final Interview Question
	 
	
	static ArrayList<Integer> checkMatchChar(String[] str1)
	{
		int l = str1.length;
		ArrayList<Integer> al = new ArrayList<>();

		int i=0;
		int j=1;
		while(i<l)
		{
			if(j<l)
			{
				for(int k=0;k<str1[j].length();k++)
				{
					if(str1[i].charAt(k) == str1[j].charAt(k))
					{
						al.add(i);
						al.add(j);
						al.add(k);
					}
				}
				j++;
			}
			i++;
		}
		
		System.out.println();
		return al;
	}
	public static void main(String[] args) {
		
		String[] str = {"abc","bcc","acb"};
		MatchChar.checkMatchChar(str);
		List<Integer> intList = MatchChar.checkMatchChar(str);
		System.out.println(intList);

	}

}
