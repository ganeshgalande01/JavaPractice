package collections;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {
// In hashmap values are stored in key and values format 
	
	public static void main(String[] args) {
		HashMap<Integer,String> m= new HashMap <Integer,String>();
		
		m.put(101, "java");// put is used for add element in HashMap
		m.put(102, "python");
		m.put(103, "ruby");
		m.put(104, "c#");
		m.put(105, "c");
		m.put(101, "perl");// old element replace with new element
		
		HashMap<Integer,String> m1= new HashMap <Integer,String>();
		m1.put(11, new String("Manoj"));
		m1.put(12, null);
		m1.put(null, null);
		System.out.println("element in hasmap="+m1);
		
		System.out.println("element in hasmap="+m);
		System.out.println(m.size());// size method return the size of hashmap
		
		System.out.println(m.get(101));// retrive one element from hashmap
		
		m.remove(105);// remove one record from Hasmap
		System.out.println("After removing record from HashMap="+m);
		
		System.out.println(m.containsKey(104));// return true
		System.out.println(m.containsValue("java"));// return false
		
		System.out.println(m.keySet());//[101, 102, 103, 104]
		System.out.println(m.values());// [perl, python, ruby, c#]
		
		/*for(Object entry:m.entrySet())
		{
			System.out.println("all entries in the Hashmap: "+entry);
		}*/
		
		for (int i=0;i<m.size();i++)
		{
			Set<Integer> k=m.keySet();
			
			System.out.println("all entries in hasmap: "+k);
		}
		
		
		
	}

}
