package org.suhasprogram;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n1,n2,n3;
		n1=1;
		n2=1;
		System.out.println(n1);
		System.out.println(n2);
		for (int i=2;i<=10;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
			
			
		}

	}

}
