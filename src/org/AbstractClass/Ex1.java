package org.AbstractClass;


abstract class A{
	abstract public void show();
	abstract public void print1();
	public void add(int a,int b)
	{
		System.out.println("addition of a and b="+(a+b));
	}
	
	
}

 class B extends A{
	public void show()
	{
		System.out.println("this is abstract show method");
	}
	
	public void print1()
	{
		System.out.println("this is abstract print1 method");	
	}
}

 public class Ex1 {
		

	public static void main(String[] args) {
	
		B obj= new B();
		
		obj.show();
		obj.print1();
		obj.add(59,70);
		

	}

}
