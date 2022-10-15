package org.Inheritance;

interface A
{
	public void Demo();
}

interface B
{
	public void Demo1();
	
}

public class MultipleInheritance implements A,B {
	public void Demo() 
	{
		System.out.println("demo method");
		
	}
	
	public void Demo1() 
	{
		
		System.out.println("demo1 method");
	}
	

	public static void main(String[] args) 
	
	{
		MultipleInheritance obj = new  MultipleInheritance();
		
		obj.Demo();
		obj.Demo1();
	}

}
