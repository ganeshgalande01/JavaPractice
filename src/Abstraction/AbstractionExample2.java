package Abstraction;

interface A{
	
	public void showInfo();
}



public class AbstractionExample2 implements A {
	public void showInfo()
	{
		System.out.println("interface A method ");
	}
	public static void main(String[] args) {
		
		AbstractionExample2 abs= new AbstractionExample2();
		abs.showInfo();
	}

}
