package org.ExceptionHandling;

// one try one catch
public class Exp {

	public static void main(String[] args) {
		int a=10;int b=0;
		
		try{
		int div=a/b;
		System.out.println("div of a and b "+div);
		
		
		}
		
		catch(ArithmeticException e){
			System.out.println("catch block start");
			
			e.printStackTrace();
				
			
			System.out.println("catch block end");
		}
		
	}

}
