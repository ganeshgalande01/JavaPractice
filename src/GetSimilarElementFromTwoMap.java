import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class GetSimilarElementFromTwoMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String>hm1= new HashMap<>();
		hm1.put(11, "Apple");
		hm1.put(12, "Orange");
		
		HashMap<Integer,String>hm2= new HashMap<>();
		hm2.put(11, "Apple");
		hm2.put(12, "pineapple");
		
		
			
			
			if(hm1.containsKey(hm2))
			{
				System.out.println(hm2);
			}
		
		
		
		

	}

}
