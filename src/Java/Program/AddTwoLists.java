package Java.Program;

import java.util.ArrayList;

public class AddTwoLists {

	public static void main(String[] args) {

		
		  ArrayList<Integer> ar= new ArrayList<Integer>();
		     ar.add(10);
		     ar.add(20);
		     ar.add(30);
		     ar.add(3);
		     
		     
		     ArrayList<Integer> ar1= new ArrayList<Integer>();
		     ar1.add(11);
		     ar1.add(22);
		     ar1.add(34);
		     ar1.add(38);
		     
		     ArrayList<Integer> ar3= new ArrayList<Integer>();
		     ar3.addAll(ar);
		      ar3.addAll(ar1);
		      
		     System.out.println(ar3);

	}

}
