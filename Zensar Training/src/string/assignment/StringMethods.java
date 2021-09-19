package string.assignment;

public class StringMethods {

	public static void main(String[] args) {
	
		String name1 = "Ajay";
		String name2 = "ajay";
		
		System.out.println(name1.equals(name2));     //To compare to string
		
		System.out.println(name1.equalsIgnoreCase(name2));	//To compare string ignore the case
		
		System.out.println(name1.compareTo(name2));        //compare using ASCI code
		
		System.out.println(name2.toUpperCase());
		
		System.out.println(name1.charAt(3));			//To get the character at particular index 
		
		System.out.println(name2.indexOf("a"));			//To get the index of given character 
		System.out.println(name1.lastIndexOf("a"));
		
		
		System.out.println(name2.replace("j", "m"));	//To replace specific char with new char
		
		System.out.println(name1.substring(2));			//To get string from main string
		
		System.out.println(name2.split("j"));
		
		
		
		
	}

}
