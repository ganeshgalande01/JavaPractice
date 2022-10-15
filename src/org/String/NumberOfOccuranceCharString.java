package org.String;

public class NumberOfOccuranceCharString {

	public static void main(String[] args) {
		// how many times a is in string 
		String str="Welcome to java world";
		int count= str.length();
		int occurcount=str.replace("a", "").length();
		
		System.out.println("total number of a in string="+(count-occurcount));
	}

}
