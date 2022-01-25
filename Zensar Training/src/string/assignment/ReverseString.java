package string.assignment;


public class ReverseString
{
	public static void main(String[] args)
	{
		String str = "moazzam";
		String revrse="";

		for(int i=str.length()-1;i>=0;i--)
		{
			revrse = revrse+str.charAt(i);
		}	
		System.out.println(revrse);
	}
}