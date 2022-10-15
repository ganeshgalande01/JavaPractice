import java.util.HashMap;

public class CountOccuranceOfcharFromString {

	public static void main(String[] args) {
		String str="Welcome to java";
		char ch[]=str.toCharArray();
		HashMap<Character,Integer> hm= new HashMap<>();
		for(char c:ch)
		{
			if(hm.containsKey(c))
			{
				hm.put(c, hm.get(c)+1);
			}
			
			else {
				hm.put(c, 1);
			}
		}
		
		System.out.println(hm);
	}

}
