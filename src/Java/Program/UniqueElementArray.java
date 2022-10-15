package Java.Program;
import java.util.Arrays;
import java.util.HashSet;

public class UniqueElementArray {

	public static void main(String[] args) {
		String arr[]= {"C#","C#","python","C#","java"};
		
		HashSet<String> hs=new HashSet<String>(Arrays.asList(arr));
		
	//	ArrayList<String> al=new ArrayList<String>(Arrays.asList(arr));
		
		System.out.println(hs);
		
		//System.out.println(al);
		


	}

}
