package org.String;

public class StringTest {

	public static void main(String[] args) {
		String str= new String("pune");
		String str1="pune";
		
		String str2= new String("punE");
		String str3="THANE";
			String str4="Hello ";
		System.out.println(str);
		System.out.println(str==str1);
		System.out.println(str==str2);
		System.out.println(str1==str3);
		
		System.out.println(str.equals(str1));  //compare two String
		System.out.println("str and str3="+str.equals(str3)); //
		
		System.out.println(str.equalsIgnoreCase(str2));
		System.out.println(str.charAt(1));
		
		System.out.println(str1.concat(str3));
		
		System.out.println(str4.trim( ));
		
		System.out.println(str3.toLowerCase());
		
		//String str5= new String();
		//System.out.println(str5);
		
	}

}
