package InteritanceExamples;


interface A
{
	public void printAInfo();
	
	public static void Demo()
	{
		System.out.println("Method from interface A");
	}
	
}

interface B
{
	public void printBInfo();
	
	public static void Demo()
	{
		System.out.println("Method from interface B");
	}
}
public class MutipleInheritance implements A,B
{
	public void printAInfo()
	{
		System.out.println("printing A class info");
	}
	
	public void printBInfo()
	{
		
		System.out.println("printing B class info");
	}
	
	public void Demo()
	{
		System.out.println("Method from class MutipleInheritance");
	}
	
	public static void main(String[] args) {
		MutipleInheritance obj= new MutipleInheritance();
		obj.printAInfo();
		obj.printBInfo();
		obj.Demo();
		

	}

}
