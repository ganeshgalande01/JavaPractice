
public class ReverseString {

	public static void main(String[] args) {
		
		String str="Welcome to java";
		StringBuffer sb= new StringBuffer(str);
		sb.reverse();
		
		System.out.println("Reverse string is : " +sb);
	}

}
