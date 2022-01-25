package com.inheritance;

public class Child {
	
	public void display()
	{
		System.out.println("in Child display method");
	}
  
	 
	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.display();
	}
	
}
