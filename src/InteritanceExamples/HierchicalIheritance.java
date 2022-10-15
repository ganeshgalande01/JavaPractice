package InteritanceExamples;

class parent{
	String name;
}

class child extends parent{
	public void childInfo()
	{
		System.out.println("print child info");
	}
}

class child1 extends parent{
	public void childInfo()
	{
		System.out.println("print child1 info");
	}	
}

public class HierchicalIheritance {

	public static void main(String[] args) {
		child1 ch= new child1();
		ch.childInfo();
	}

}
