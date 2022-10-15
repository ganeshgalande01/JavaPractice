
public class SwapString {

	public static void main(String[] args) {
		String str="Welcome";
		
		String str1="java";
		
		System.out.println("Before swap string : "+str+" "+str1);
		
		String temp=str;
		str=str1;
		str1=temp;
		
		System.out.println("After swap string : "+str+" "+str1);
		
		

	}

}
