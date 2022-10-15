

class Test1{
	public int add(int a,int b)	{
		System.out.println("superclass method1");
		return a+b;
	}	
	public float add(int a,float b)	{
		
		System.out.println(this.add(11,11));
		System.out.println("superclass method2");
		return a+b;
	}	
}
public class OveridingExp1 extends Test1 {
	
	public int add(int a,int b)	{
		//System.out.println(super.add(12, 12));
		System.out.println("subclass method");		
		return a-b;	}
	public static void main(String[] args) {
		
		OveridingExp1 obj= new OveridingExp1();
		System.out.println("addition of a and b="+obj.add(13,12.89f));
		
		//System.out.println("addition of a and b="+);
			
		

	}

}
