
// java program to to find which character of string can be replace '?' from string to make string palindrome for given string
//problem example (p?p,pip) (n?t,ton);  Also find its possible or not


package interview.programs;

public class Palindrom {
	
	public static void main(String args[])
	{
		String s1="pip";
		String s2="p?p";
		String s3  = "";     //To store characters after replacing '?'
		String s4= "";		//To store characters that will replace '?'
		String s5="";
		
		//form palindrome the length of both string must equal 
		
		if(s1.length()==s2.length())
		//if length are same then we proceed 
		{
			for(int i=0;i<s2.length();i++) 
			{
				if(s2.charAt(i)!='?')  //Whenever char arrive which is not equal to '?'
				{
					s3=s3+s2.charAt(i);  //That char will concatenated with S3 String
				}
				else
				{
					s3=s3+s1.charAt(i);  // Whenever character equals to '?' it will replace that char by s1.charAt(index) method
					s4=s4+" "+s1.charAt(i);  //S4 stores the characters that can replace '?'
					
				}
			}
		}
		else
			//when length are not equal
		{
			System.out.println("not posible");
		}
		
		//To check Palindrome we have to reverse our main string and compare this string with S3
		
		for(int i=s1.length()-1;i>=0;i--)
		{
			s5= s5+s1.charAt(i);
		}
		
		if(s5.equals(s3))
		{
			System.out.println("Palindron can be obtain by ading"+s4);
		}
		else
		{
			System.out.println("Not posible");
		}
		
		
	}
	

}
