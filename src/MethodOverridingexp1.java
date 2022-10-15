class A1
{
	public void Demo()
	{
		System.out.println("this is Class A method ");
		
	}

}


public class  MethodOverridingexp1 extends A1
{

	public static void main(String[] args) {
		MethodOverridingexp1 obj= new MethodOverridingexp1();
		obj.Demo();
		
		
		
	}

	public void Demo()
	{
		super.Demo();
		System.out.println("this is Class MethodOverridingexp1 method ");
	}	

}
