// how to reverse sentence in java
public class ReverseSentence {

	public static void main(String[] args) {
		String str="Welcome to java programming with Ganesh";
		
		String s1[]=str.split(" ");
		for(int i=s1.length-1;i>0;i--)
		{
			System.out.println(s1[i]);
		}

	}

}
