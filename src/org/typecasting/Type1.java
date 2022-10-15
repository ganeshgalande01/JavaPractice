package org.typecasting;
class Encapsulation
{
	private int a;
	
	public  void setA(int x)
	{
	this.a=x;
	}
	
	public int getA()
	{
	return a;
	}
	
}
public class Type1{
	public static void main(String args[])
	{
		Encapsulation obj= new Encapsulation();
		obj.setA(78);
		System.out.println(obj.getA());
	}
}
