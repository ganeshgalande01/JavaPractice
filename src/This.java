

public class This {
	int a=20;
	public void add()
	{
		int b=60;
		System.out.println("value of b="+b);
	}

	public static void main(String[] args) {
		This obj= new This();
		obj.print();

	}
	
	void print()
	{
		this.add();
		int a=10;
		System.out.println("value of a="+this.a);
		System.out.println("value of a="+a);
	}
	
	
	
	

}
