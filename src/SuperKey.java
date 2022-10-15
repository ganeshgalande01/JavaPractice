
class A{
	int a=20;
	void show()
	{
		
		System.out.println("this is class A method");
	}
}

class B extends A{
	void show()
	{
		int a=10;
		super.show();
		System.out.println(super.a);
		System.out.println(a);
		System.out.println("this is class B method");
	}
}
public class SuperKey {
	public static void main(String [] args)
	{
		B obj= new B();
	    obj.show();
		System.out.println("");
	}

}
