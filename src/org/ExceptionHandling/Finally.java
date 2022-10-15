package org.ExceptionHandling;

public class Finally {

	public static void main(String[] args) {
		System.out.println("**program start**");
		
		try{
			int a=89; int b=0;
			int c=a/b;
			System.out.println("divison of a and b="+c);
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("catch block");
			
		}
		
		
		finally 
		{
			System.out.println("Finally block");
			
		}
		
		System.out.println("**program end**");

	}

}
