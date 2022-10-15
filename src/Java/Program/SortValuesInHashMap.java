package Java.Program;


import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortValuesInHashMap {

	public static void main(String[] args) {
		   HashMap<String,Integer> hm= new HashMap<String,Integer>();
			hm.put("English", 55);
			hm.put("Marathi", 56);
			hm.put("Hindi", 45);
			hm.put("Math", 23);
			hm.put("Science",89);
			
		Map<String, Integer> hh= new TreeMap<>(hm);
			
			System.out.println("unsorted hashmap"+hm);
			System.out.println("sorted hashmap"+hh);
			
			
	}

	
	
}
