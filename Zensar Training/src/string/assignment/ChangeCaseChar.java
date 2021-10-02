package string.assignment;

public class ChangeCaseChar {

	public static void main(String[] args) {
		
		String str = "zEnSaR";
		char ch = str.charAt(0);
		int asci = (int)ch;
		if(asci==122)
		{
			asci =  asci-32;
			System.out.println((char)asci);
		}

	}

}
