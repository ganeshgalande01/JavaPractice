package collections;

import java.util.HashMap;

public class Hashset {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hm= new HashMap<>();
		
		hm.put(11, "Orange");
		hm.put(12, "Apple");
		
		HashMap<Integer,String> hm1= new HashMap<>();
		hm.put(11, "Orange");
		hm.put(13, "banana");
		
		
		
		if(hm.entrySet().equals(hm1.entrySet()))
		{
			System.out.println("duplicate entries in hm and hm1 :"+hm.keySet());
			
		
		}

	}

}
