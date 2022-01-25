
//Program to change case of character . If character is vowel then change into upper case if consonant then change to lower case
package interview.programs;

public class ChangeCase {

	public static void main(String[] args) {
		String s = "Helloword";
		int asci = 0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch = s.charAt(i);
			
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') // To check vowels
			{
				asci = (int)ch;
				if(asci>=97)
				{
					asci = (int)ch-32;
					System.out.print((char)asci);
				}
				else
				{
					System.out.print((char)asci);
				}
				
			}
			else
			{
				asci = (int)ch;
				if(asci<97)
				{
					asci = (int)ch+32;
					System.out.print((char)asci);
				}
				else
				{
					System.out.print((char)asci);
				}
				
			}
		}

	}

}
