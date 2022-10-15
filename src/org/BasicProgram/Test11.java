package org.BasicProgram;
 class Test1 {
	public int a=10;
	protected int  p=678;
	private int pr=98;
	int d=78;
	
	void show()
	{
		System.out.println(a);
		System.out.println(p);
		System.out.println(pr);
		System.out.println(d);
		
	}
	}



public class Test11{
	
	private int b=49;
	void display()
	{
		Test1 obj1 = new Test1();
		
		
		System.out.println(obj1.a);
		System.out.println(obj1.p);
		//System.out.println(obj1.pr);// private access not allowed here
		System.out.println(obj1.d);
		
	}
	public static void main (String args[])
	{
		Test1 obj= new Test1();
		//obj.a();
		System.out.println(obj.a);
		System.out.println(obj.p);
		//System.out.println(obj.pr); not allowed outside of class 
		System.out.println(obj.d);
		
	}
	
}


