package Java.Program;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArrayUsingHashSet {

	public static void main(String[] args) {
		int a[]= {10,30,10,40,45,40};
		
		Set<Integer> hs =new HashSet <Integer>();
				
		for(int ch:a)
		{
			hs.add(ch);
		}
		
		System.out.println(hs);
		
		
String str[]= {"c#","java","java","python","ruby"};
		
		Set<String> hs1 =new HashSet <String>();
				
		for(String ch:str)
		{
			hs1.add(ch);
		}
		
		System.out.println(hs1);
	}

}
