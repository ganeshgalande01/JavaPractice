
public class Demo {

	public static void main(String[] args) {
		
		String str="sys";
		String str1=str;
		String rev=null;
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);  
		}
		

		if(rev.equals(str1))
		{
			System.out.println("string palindrome");
		}
		
		else
		{
			System.out.println("string not palindrome");
		}
		
		
	}

}
