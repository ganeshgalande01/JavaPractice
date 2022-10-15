package org.suhasprogram;

public class FindDuplicateCharString {

	public static void main(String[] args) {
		String s="Welcome to java World";
		
		String s1=s.replace(" ","");
		
		System.out.println(s1);

		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				if(s1.charAt(i)==s1.charAt(j))
				{
				
					System.out.println("Duplicate character are:"+s1.charAt(i));
					
				}
			}
		}
	}

}
