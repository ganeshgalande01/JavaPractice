package Singleton;

public class Singleton {
	 static  int a=19;
	static Singleton obj;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getobj()
	{
		if(obj==null)
			obj=new Singleton();
		
		return obj;
	}

	public static void main(String[] args) {
		
		Singleton obj1 =new Singleton().getobj();
		System.out.println(a);// before update value of a
		obj1.a=500;
		System.out.println(a);
		
		Singleton obj2= new Singleton();
		obj2.a=50;
		System.out.println(obj2.a);
		System.out.println(obj1.a);
		
		
	}

}
