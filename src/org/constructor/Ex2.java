package org.constructor;

public class Ex2 {
	
	public Ex2()
	{
		
		System.out.println("This is default constructor");
	}
	
	public Ex2(int a,int b){
this();
	System.out.println("This is parameterised constructor");
	}
	public Ex2(float a)
	{
	this(19,23);
		//System.out.println(a);
		
		System.out.println("float constructor");
	}
	
	public static void main (String args [])
	{
		Ex2 obj= new Ex2(23.45f);
		
		
	
	
	}
	
}
