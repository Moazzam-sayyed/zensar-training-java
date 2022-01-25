package array.programs;

public class Child extends Parent {
	
	public void display()
	{
		System.out.println("In Child Display");
	}

	public static void main(String[] args) {
		
		Parent p = new Parent();
		Child c = new Child();
		p.display();
		c.display();

	}

}
