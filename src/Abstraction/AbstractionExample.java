package Abstraction;

abstract class Demo

{
	abstract void printInfo();
	
	public void showInfo()
	{
		System.out.println("show the info of Demo Class");
	}
	

}

public class AbstractionExample extends Demo {
	void printInfo()
	{
		System.out.println("print the info of Demo Class");
	}
	

	public static void main(String[] args) {
		AbstractionExample obj= new AbstractionExample();
		//obj.printInfo();
		//obj.showInfo();
		
		
		
		
		

	}

}
