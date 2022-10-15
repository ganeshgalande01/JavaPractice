package org.Encapsulation;

 class Exp111 {
	private int a;
	private int b;
	
	public void setA(int x)
	{
		a=x;
	}
	
	public void setB(int x)
	{
	b=x;
	}
	
	public int getA()
	{
		return a;
		
	}
	
	public int getB()
	{
		return b;
		
	}

}

public class Encapsulation {

	public static void main(String[] args) {
		System.out.println("program start");
		System.out.println("before update the value");
		
	
		Exp111 obj= new Exp111();
		
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		
		System.out.println("After update the value");
		obj.setA(12);
		obj.setB(56);
	
		System.out.println(obj.getA());
		System.out.println(obj.getB());
		
		System.out.println("program End");

	}

}
