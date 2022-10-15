package org.constructor;

public class ConstructorDemo {
	
	public ConstructorDemo()
	{
		System.out.println("this is default constructor");
	}
	
	public ConstructorDemo(int a,int b)
	{
		this();
		System.out.println("this is parametirsed constructor A and b");
	}
	
	public ConstructorDemo(int a)
	{
		this(11,13);
		System.out.println("this is parametirsed constructor");
	}

	public static void main(String[] args) {
		
		ConstructorDemo obj=new  ConstructorDemo(11);
		

	}

}
