package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListExp1 {

	public static void main(String[] args) {
		ArrayList<Object> ar= new ArrayList<Object>();
		ar.add(11);
		ar.add("java");
		ar.add(12);
		ar.add('c');
		ar.add(true);
		System.out.println("Array list elements "+ar);
		System.out.println("ArrayList size "+ar.size());// size of arraylist
		ar.remove("java");
		
		System.out.println("After removing Array list elements  "+ar);
		
		ar.remove(0);
		System.out.println("After removing Array list elements  "+ar);
		ar.add(0,11);
		ar.add("java");
		System.out.println("After adding Array list elements  "+ar);
		
		/*for (int i=0;i<ar.size();i++)
		{
			System.out.println(ar.get(i));
		}
		*/
		
		for (Object ar1:ar)
		{
			System.out.println(ar1);
		}
		
		java.util.Iterator<Object> itr = ar.iterator();
		System.out.println(itr.hasNext());
		//System.out.println(itr.next());
		
		System.out.println("************");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println(ar.contains("c#"));
		ArrayList ar1= new ArrayList();
		ar1.add('a');
		ar1.add('c');
		ar1.add('b');
		ar1.add('d');
		ar1.add('e');
		
		ar1.addAll(ar);
		
		System.out.println(ar1);
		
		ar1.removeAll(ar);
		
		System.out.println("before reverse order"+ar1);
		
		Collections.sort(ar1, Collections.reverseOrder()); 

		System.out.println("reverse order"+ar1);
		
		Collections.sort(ar1); 
		
		System.out.println("after sorting "+ar1);
		
			

	}

}
