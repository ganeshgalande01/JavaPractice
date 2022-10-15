package Java.Program;

//swaping  using 3rd variable

public class SwapNumber {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int temp;
		System.out.println("number before swapping "+a+"  "+b);
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("number After swapping "+a+"  "+b);
		
		
		swapnum();
	}
	// swaping without using 3rd variable
	public static void swapnum()
	{
		int a=30;
		int b=40;
		System.out.println("number before swaping "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("number after swaping "+a+" "+b);
		
		
	}

}
