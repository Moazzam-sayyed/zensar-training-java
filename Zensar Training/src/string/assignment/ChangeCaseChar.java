package string.assignment;

public class ChangeCaseChar {

	public static void main(String[] args) {
		
		String str = "ZeNsAr";
		String str2 = "";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int asci = (int)ch;
			
			if(asci<97)
			{
				int temp1 = asci+32;
				str2=str2+(char)temp1;
			}
			else
			{
				int temp2 = asci-32;
				str2=str2+(char)temp2;
			}
//			int j = asci+32;
			
			
////			if(asci<92)
////			{
////				asci =  asci+32;
////				str2=str+(char)asci; 
////			}
//			else
//			{
//				asci =  asci-32;
//				str2=str+(char)asci;
//			}

		}
		System.out.println(str2);
	}
}
