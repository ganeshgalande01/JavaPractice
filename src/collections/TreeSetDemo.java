package collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
	TreeSet <Object> tr= new TreeSet <Object> ();

	tr.add("java");
	tr.add("python");
	tr.add("c#");
	tr.add("d");
	
	System.out.println("Tree set "+tr);
	
	
	TreeSet <Object> tr1= new TreeSet <Object> ();
	tr1.add('A');
	tr1.add('D');
	tr1.add('b');
	tr1.add('e');
	tr1.add('C');
	
	System.out.println("Tree set "+tr1);
	
	}
	
	

}
