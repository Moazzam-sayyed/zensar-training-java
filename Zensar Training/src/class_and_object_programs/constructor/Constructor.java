package class_and_object_programs.constructor;

public class Constructor {

	Constructor()
	{
		int x=20;
		int y=30;
		System.out.println("I am in Default constructor");
		System.out.println("addition of number is: "+(x+y));

	}
	Constructor(int x,int y)
	{
		System.out.println("I am in Parameterized constructor");
		System.out.println("addition on numbers is:"+(x+y));
	}
	public static void main(String[] args) {
		Constructor constructor = new Constructor();
		Constructor constructor1 = new Constructor(12,20);
		// TODO Auto-generated method stub

	}

}
