package org.constructor;

public class Ex1 {
	
	public  Ex1()
	{
		System.out.println("This is default constructor");
	}
	
	public void Ex1(int a,int b)
	{
	int sum=a+b;
	System.out.println(sum);
	System.out.println("This is parameterised constructor");
	}
	public void Ex1(float a)
	{
		
		System.out.println(a);
	}
	
	public static void main (String args [])
	{
		Ex1 obj= new Ex1();
		obj.Ex1(11,12);
		obj.Ex1(173.4f);
	}
	
}
