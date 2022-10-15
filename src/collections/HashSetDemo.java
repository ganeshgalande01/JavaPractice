package collections;


import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> h= new HashSet<String>();
		h.add("java");
		h.add("c#");
		h.add(null);
		h.add(new String("ruby"));
		h.add("python");
		
		
			System.out.println(h);
		
		
		System.out.println("Hashset values "+h);
		//Iterator itr= (Iterator) h.iterator ();
		for (String o:h)
		{
			System.out.println("hashset values "+o);
		}
			
		System.out.println("containes "+h.contains("java"));
	
		System.out.println("contain all method call here");

		HashSetDemo obj= new HashSetDemo();
		obj.containAllMethod();
		obj.removeAllMethod();
	}
	
	public void containAllMethod()
	{
		HashSet<Object> s= new HashSet <Object>();
		s.add(11);
		s.add(13);
		s.add(16);
		
		HashSet <Object> s1= new HashSet <Object>();
		s.add(12);
		s.add(13);
		s.add(16);
		
		System.out.println(s.containsAll(s1));
		
		
	}
	
	public void removeAllMethod()
	{
		HashSet<Object> s= new HashSet <Object>();
		s.add(11);
		s.add(13);
		s.add(16);
		
		HashSet <Object> s1= new HashSet <Object>();
		s1.add(11);
		s1.add(12);
		s1.add(16);
		
		s.removeAll(s1);
		
		System.out.println(s); 
		System.out.println(s.size()); 
	}
	
}



