package org.ExceptionHandling;

public class Exp2 {

	public static void main(String[] args) {
		int a=10;int b=10;
		
		try{
		int div=a/b;
		System.out.println("div of a and b "+div);
		
		int arr[]={10,30,49};
		System.out.println("array value="+arr[6]);
		
		String str="Hello";
		System.out.println("char at value="+str.charAt(3));
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		System.out.println("all exception catch");
		
		}
		

	}

}
