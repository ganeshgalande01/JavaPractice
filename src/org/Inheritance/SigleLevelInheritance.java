package org.Inheritance;


class parent11
{
	void test1()
	{ System.out.println("Test1 method from parent");
	}
	
	parent11()
	{
		System.out.println("default constructor");
	}
}

class child extends parent11
{  
	
	void test1()
	{ System.out.println("Test1 method from child");
	
	}
	
	void test2()
	
	

{
		super.test1();
		
		System.out.println("Test2 method from child");
}
	
	
	
	
}

class child1 extends child
{
	void add()
	{
		int a=10;
		int b=28;
		
		System.out.println("additon of a and b= "+(a+b));	
	}

}



public class SigleLevelInheritance {



	public static void main(String[] args) {

		child1 obj= new child1();
		obj.test1();
		obj.test2();
		obj.add();
		

	}

}
