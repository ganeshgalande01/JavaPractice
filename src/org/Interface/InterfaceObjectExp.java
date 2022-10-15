package org.Interface;

interface Intr1{
	public int add(int a,int b);
	public int sub(int a,int b);
	
}

public class InterfaceObjectExp {

	public static void main(String[] args) {
		Intr1 obj= new Intr1()
		{
			public int add(int a,int b)
			{
				return a+b;
			}
			
			public int sub(int a,int b)
			{
				return a-b;
			}
		};
		
		System.out.println("Addition of a and b=" +obj.add(10, 20));
		System.out.println("substraction of a and b=" +obj.sub(100, 20));
		

	}

}
