package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		ArrayList <Object> al= new ArrayList <Object> ();
		al.add("Java");
		al.add("GANESH");
		al.add("GANESH");
		al.add(90);
		al.add("GANESH");
		al.add("Welcome");
		
		ArrayList <Object> al_dup= new ArrayList <Object> ();
		al_dup.addAll(al);
		
		System.out.println("elements presents in the al_dup "+al_dup);
		al_dup.removeAll(al);
		// after remove all elements from al_dup
		
		System.out.println("elements presents in the al_dup "+al_dup);
		
		// copy element array to array list 
		
		Object arr[]={10,20,30,40,50};
		
		ArrayList<Integer> ar= new ArrayList(Arrays.asList(arr));// copy all elements array to arraylist
		
		System.out.println(ar); 
		
		for(Object ele:ar) // retrive elements from ArrayList
		{
			System.out.println(ele);
		}
		
		
		

	}

}
