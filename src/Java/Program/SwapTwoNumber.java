// swap two number without using third variable

package Java.Program;

public class SwapTwoNumber {

	public static void main(String[] args) {
	
		int a=20;
		int b=30;
		System.out.println("Before swap two number "+a+" "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap two number "+a+" "+b);
		
	}

}
