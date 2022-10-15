package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList <String>();
		al.add("Welcome");// add elements in List
		al.add("Hello");
		al.add("Java");
		//al.add(0,null);// add elements to particular index position
		al.set(0, null); // set replace welcome with null
		
		System.out.println(al);// print elements from ArrayList

		System.out.println("After removing 2 elements in array list " +al);
		al.add("Ganesh");
		al.add(null);
		
		System.out.println(al);//[C#, Java, Ganesh, null]
		al.set(0, "Python"); // replace elements with new element
		System.out.println(al); 
		
		// retrive particular index element from list
		System.out.println(al.get(3)); 
		
		al.add("null");
		
		System.out.println(al);
		

		
		ArrayList<Integer> ar1= new ArrayList<Integer>();
		ar1.add(11);
		ar1.add(12);
		ar1.add(13);
		ar1.add(14);
		ar1.add(15);
		
		ArrayList<Integer> ar2= new ArrayList<Integer>();
		ar1.add(1);
		ar1.add(2);
		ar1.add(3);
		ar1.add(4);
		ar1.add(5);
		
		//ar1.addAll(ar2);
		
		ar1=(ArrayList<Integer>) ar2.clone();
				
		System.out.println(ar1);
		
		
	
		
		

	}

}
