package Java.Program;

public class SwapingTwoStringWithoutUsingThirdVariable {

	public static void main(String[] args) {
		String a="welcome";
		
		String b="java";
		
		System.out.println("Before swaping "+a+" "+b);
		
		a=a+b;
		
		b=a.substring(0,a.length()-b.length());
		
		a=a.substring(b.length());
		
		System.out.println("After swaping "+a+" "+b);
		

	}

}
