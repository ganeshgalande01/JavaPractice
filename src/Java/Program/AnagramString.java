package Java.Program;

import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
	
		System.out.println(checkAnagram("nestil","Listen")); 
		   
    }
 
 public static boolean checkAnagram(String s1,String s2)
 {
     s1=s1.replaceAll("s","");
     s2=s2.replaceAll("s","");
     
     if(s1.length()!=s2.length())
     {
         return false;
     }
     
     else
     {
         
         char []arr1= s1.toLowerCase().toCharArray();
         char [] arr2=s2.toLowerCase().toCharArray();
         Arrays.sort(arr1);
         Arrays.sort(arr2);
         return (Arrays.equals(arr1,arr2));
     }
	}

}
