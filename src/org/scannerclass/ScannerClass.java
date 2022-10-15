package org.scannerclass;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		System.out.println("please enter a value");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("a value="+a);
		
	
		


ScannerClass obj= new ScannerClass();
obj.stringValue();

	}
	
	void stringValue()
	{
		System.out.println("enter string value");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("string value s="+s);
	}

}
