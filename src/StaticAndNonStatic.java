



public class StaticAndNonStatic {
	int a=10;
	static int  b=30;
	
	public static void main(String[] args) {
		System.out.println("***program start here**");

		
		StaticAndNonStatic obj= new StaticAndNonStatic();
		System.out.println("a value = "+ obj.a); // non static to static calling only one way 
		
		System.out.println();
		System.out.println("b value = "+b); // static to static calling way 1
		System.out.println("b value = "+ obj.b); // static to static calling way 2
		System.out.println("b value = "+ StaticAndNonStatic.b); // static to static calling way 3
		
		abc obj1= new abc();
		//obj1.test();
		
		obj1.test1();
		
		
		System.out.println("***program end here**");
		
	}



}


class abc{
	
	
	
	public void test()
	{
		this.test1(); // non static to nonstatic calling way 1
		//abc h= new abc();// non static to nonstatic calling way 2
		//h.test1();// non static to nonstatic calling way 3
	test1();
		System.out.println("this is test method");
	}
	
	
	public void test1()
	{
		 int a1=45;
		abc s= new abc(); // static to non static calling only one way 
		s.Demo();
		System.out.println("this is test1 method");
	}
	
	public static void Demo()
	{
		abc b= new abc();

		System.out.println("this is static demo mehod");
	}
	
}
