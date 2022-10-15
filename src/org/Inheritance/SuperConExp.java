package org.Inheritance;

class Parent1{
	//public Parent1()
	//{
	//	System.out.println("This is parent1 default constructor");
	//}
	public Parent1(int a)
	{
		System.out.println("This is parent1 int constructor");
	}
	
	public Parent1(int a, int b)
	{
		this(11);
		System.out.println("This is parent1 int-para constructor");
	}
	
	public Parent1(float a)
	{
		this(11,12);
		System.out.println("This is parent1 float constructor");
	}
	
}

public class SuperConExp {

	public static void main(String[] args) {
		Parent1 obj= new Parent1(12.4f);
		

	}

}
