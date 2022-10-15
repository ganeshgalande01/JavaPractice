package org.BasicProgram;

class A{
	void show()
	{
		System.out.println("this is superclass method");
	}
}

public class B extends A{
	void show()
	{
		super.show();
		System.out.println("this is subclass method");
	}
	
	public static void main(String args[])
	{
		System.out.println("**program start");
		B obj= new B();
		obj.show();
		
		System.out.println("**program end");
	}
}