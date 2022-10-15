package org.ExceptionHandling;

public class Exp1 {

	public static void main(String[] args) {
		int a=10;int b=10;
		
		try{
		int div=a/b;
		System.out.println("div of a and b "+div);
		
		int arr[]={10,30,49};
		System.out.println("array value="+arr[2]);
		
		String str="Hello";
		System.out.println("char at value="+str.charAt(7));
		
		}
		
		catch(ArithmeticException e){
			System.out.println("catch block start");
			
			e.printStackTrace();
				
			
			System.out.println("catch block end");
		}
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catch1 block start");
			
			e.printStackTrace();
				
			
			System.out.println("catch1 block end");
		}
		
		catch(StringIndexOutOfBoundsException e){
			System.out.println("catch2 block start");
			
			e.printStackTrace();
						
			System.out.println("catch2 block end");
		}
		
	}

}
