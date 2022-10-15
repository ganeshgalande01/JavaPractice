package PolyMorphim;

class A{
	
	public void demo()
	{
		System.out.println("Class A method");
	}
}

public class MethodOverriding extends A{
	
	public void demo()
	{
		super.demo();
		System.out.println("Class MethodOverriding method");
	}

	public static void main(String[] args) {
		MethodOverriding obj= new MethodOverriding();
		obj.demo();

	}

}
