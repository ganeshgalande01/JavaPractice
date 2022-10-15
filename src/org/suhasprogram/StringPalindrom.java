package org.suhasprogram;

import java.util.Scanner;

public class StringPalindrom {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter String");
		String s=s1.next();
		String org=s;
		String rev="";
		
		for (int i = s.length()-1; i >0; i--) 
		{
			rev=rev+s.charAt(i);
		}
		if(org.equals(rev))
		{
			System.out.println("String is palindrom");
		}
		else{
			System.out.println("String is not palindrom");
		}
	}

}
