package org.Demo;
abstract class B
{
abstract  int add(int a, int b);
}

public class Abc1 extends B {
	  int add(int a, int b)
	{
		return a+b;
	}
	

	public static void main(String[] args) {
		Abc1 obj = new Abc1();
		System.out.println(obj.add(11,59));

	}

}
