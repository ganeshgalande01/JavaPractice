package collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//Creating LinkedList
		LinkedList l= new LinkedList();
		
		l.add(10);
		l.add("java");
		l.add("c#");
		l.add("python");
		l.add("ruby");
		l.add("c");
		
		System.out.println("Elements in LinkedList"+l);
		l.add(0,"hello");// add element in particular position
		l.remove(0); // removing element 
		//l.remove("c");
		
	//	retrive element 
		
	/*	for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}*/
		
		
//		for (Object i:l)
//		{
//			System.out.println(i);
//		}
//		
	System.out.println("get particular element from list="+l.get(3)); // retrive 4th number element from list
		
		l.set(0, "hello"); // modify element from list
		System.out.println("After modity elementy in list="+l);
	
		LinkedList ll= new LinkedList();
		ll.addAll(l);
		System.out.println(ll);
		ll.removeAll(l);
		System.out.println(ll);// after removing element from list ..
		
		

	}

}
