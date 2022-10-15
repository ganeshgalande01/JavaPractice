package collections;

import java.util.Collections;
import java.util.Hashtable;
import java.util.List;

public class HashTable {

	public static void main(String[] args) {
		Hashtable <Integer, String> t= new Hashtable <Integer, String>();// default table capcity is 11 and load factor 0.75
		//Hashtable t= new Hashtable(capacity);
		//Hashtable t= new Hashtable(capacity, load factor);
		
		t.put(101, "java");
		t.put(102, "c#");
		t.put(103, "python");
		t.put(104, "perl");
		t.put(105, "ruby");
		t.put(106, "c++");
		t.put(107, "html");
		
		System.out.println("values in hashtable: "+t);
		System.out.println(t.get(104));
		t.containsKey(101);
		
//		for (int i:t.keySet())
//		{
//	System.out.println(i+" "+t.get(i));
//		}
		
	
		System.out.println(t.values());
		System.out.println(t.keySet());
		
	}

}
