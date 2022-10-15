package org.AccessSpacifier;


class A11{
	void show()
	{
		AccessSpecifier12 obj1= new AccessSpecifier12();
		
		System.out.println(obj1.b);
		System.out.println(obj1.p);
		System.out.println(obj1.pr);
		
		
	}
}

public class AccessSpecifier12 {
	
	private int a=12;//within class
	int b=20;// within package
	public int p=24; //outside package
	protected int pr=19; //within package as well as outside of package through inheritance
	
	

	public static void main(String[] args) {
		
		AccessSpecifier12 obj= new AccessSpecifier12();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.p);
		System.out.println(obj.pr);
		
		


	}

}
