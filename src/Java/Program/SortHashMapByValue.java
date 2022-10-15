package Java.Program;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.RowFilter.Entry;

public class SortHashMapByValue {

	public static void main(String[] args) {
		HashMap<Integer,String> hm= new HashMap<Integer,String>();
		hm.put(15,"Apple");
		hm.put(11,"Orange");
		hm.put(13,"Papya");
		hm.put(12,"Graphs");
		hm.put(14,"Lemon");
		
		
//	List<Entry<Integer,String>> list = new 	LinkedList<>(list.entrySet(hm));
		
		  System.out.println(hm);
		     
		  hm.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		      //System.out.println(hm);

	}

}
