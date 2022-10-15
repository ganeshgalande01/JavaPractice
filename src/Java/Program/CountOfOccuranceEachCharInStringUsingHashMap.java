package Java.Program;

import java.util.HashMap;

public class CountOfOccuranceEachCharInStringUsingHashMap {

	public static void main(String[] args) {
		
		String str="Welcome ";

		char arr[]=str.toCharArray();
		
		HashMap<Character,Integer> hm=new HashMap<Character,Integer>();
		for(char ch:arr)
		{
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			
			else hm.put(ch, 1);
		}
		System.out.println(hm);
	}

}
