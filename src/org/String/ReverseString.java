package org.String;

public class ReverseString {

	public static void main(String[] args) {
		String str="welcome to java";
		char rev;
		int i;
		
		for( i=str.length()-1;i>=0;i--)
		{
			rev=str.charAt(i);
			
			System.out.print(rev);
			
			/*if (str.equals(rev))
			{
				System.out.println("string is palindrome");
				
			}
			else {
				System.out.println("String not palindrome");
			}*/
			
			
		}
		
		
		
	}

}
