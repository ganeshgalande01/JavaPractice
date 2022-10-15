interface parent{
	
	public void demo();
	
}





public class MultipleInheritance implements  parent {
	
	
	public void demo()
	{
		System.out.println("implementation of demo method");
	}
	

	public static void main(String[] args) {
		
		MultipleInheritance obj= new MultipleInheritance();
		
		obj.demo();
		
	}

}
