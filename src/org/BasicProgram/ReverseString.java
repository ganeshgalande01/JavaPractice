package org.BasicProgram;

public class ReverseString {

	public static void main(String[] args) {
	String Str="Welcome";
	StringBuffer bf= new StringBuffer(Str);
	
	System.out.println(bf.reverse());
	
	ReverseString obj= new ReverseString();
	obj.reverse1();
	
	}
	
	void reverse1()
	{
		String str= "Ganesh";
		StringBuilder sb1= new StringBuilder(str);
		System.out.println(sb1.reverse());
			
	}
			
	}
	







