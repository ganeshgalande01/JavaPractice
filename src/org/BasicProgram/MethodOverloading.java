package org.BasicProgram;

public class MethodOverloading {

	void add()
	{
		int a=10;
		int b=39;
	System.out.println("addition of a&b="+(a+b));
	}

	int  add(int a, int b){

		return a+b;
	}

	public static void main(String[] args) {
		MethodOverloading obj= new MethodOverloading();
		obj.add();
		int sum=obj.add(11,12);
		System.out.println("addition of a&b="+sum);

	}

}
