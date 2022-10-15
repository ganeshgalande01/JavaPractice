package org.Interface;

interface A{
	
	public void add();
	
		
}

interface B
{
	public void show();
}

public class Ex1 implements A,B {
	public void add()
	{
		int a=10;
		int b=20;
		System.out.println("addition="+(a+b));
	}
	
	public void show()
	{
		System.out.println("this is show method");	
	}

	public static void main(String[] args) {
		Ex1 obj= new Ex1();
		obj.add();
		obj.show();

	}

}
