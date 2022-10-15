package org.upcasting;

class A
{
	public void test1()
	{
		System.out.println("Test 1 method");
	}
}

class B extends A
{
	public void test2()
	{
		System.out.println("Test 2 method");
	}
}
class C extends B
{
	public void test3()
	{
		System.out.println("Test 3 method");
	}
}

public class Casting  extends C

{
	public static void main(String[] args) 
	
	{
		A ref= new C(); // upcasting 
		
		ref.test1();
		
		C ref1 = (C) new  A();// downcasting 
		
				
	}
	
	

}
