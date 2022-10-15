package org.String;

public class StringMethods {

	public static void main(String[] args) {
		String str= "My Class name is Accleration";
		String str2= "My Class Name is Accleration";
		String str1= "Welcome";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.charAt(1));
		System.out.println(str.indexOf('n'));
		System.out.println(str.substring(2,9));
		System.out.println(str.contains("name"));
		System.out.println(str.replace('s','*'));
		System.out.println(str.startsWith("my"));
		System.out.println(str.endsWith("my"));
		System.out.println(str.concat("_"+str1));
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		
		
		
		
		
	}

}
