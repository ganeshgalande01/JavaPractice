package Java.Program;

import java.util.HashMap;

public class NumberOfWordOccuranceInString {

	public static void main(String[] args) {
		 String str="Welcome to java world java";
		  
		  String arr[]=str.split(" ");
		  
		  HashMap<String ,Integer> hm= new HashMap<String,Integer>();
		  
		    for(String ch:arr)
		    {
		        if(hm.containsKey(ch))
		        {
		        hm.put(ch,hm.get(ch)+1);
		        }
		        else
		        {
		            hm.put(ch,1);
		        }
		        
		    }
		    
		    System.out.println(hm);

	}

}
