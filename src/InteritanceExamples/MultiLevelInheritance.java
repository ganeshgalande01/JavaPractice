package InteritanceExamples;

class shap{
	String color;
}

class Triangle extends shap{
	
	public void println()
	{
		System.out.println("this is from trangle class");
	}
	
}

class Rectangle extends Triangle{
	
	public void println()
	{
		System.out.println("this is from Rectangle class");
	}
}


public class MultiLevelInheritance {

	public static void main(String[] args) {
	
		Rectangle rec= new Rectangle();
		rec.println();
		
	}

}
