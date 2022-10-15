package Java.Program;

public class ExtractLowerAndUpperFromString {

	public static void main(String[] args) {
		String s="Welcome TO Java";
		String s1=s.replaceAll(" ","");
		
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if (ch>=65 && ch<=90)  
			{
				
				System.out.println("upper case letter** " +ch);
				
			}
			
			else if(ch>=97 && ch<=122)
			{
				
				System.out.println("lower case letter** "+ch );
				
				
			}
		}

	}

}
