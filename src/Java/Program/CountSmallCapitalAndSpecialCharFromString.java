package Java.Program;

public class CountSmallCapitalAndSpecialCharFromString {

	public static void main(String[] args) {
		
		String str="WeTohunk @#%&*|";
		String str2=str.replaceAll("\\s", "");
		
		char ch[]=str2.toCharArray();
		int cap=0;
		int small=0;
		int spec=0;
		for(char c:ch)
		{
			if(c>=65 && c<=90)
			{
				cap++;
				System.out.println("capital letter "+c);
			}
			
			else if(c>=97 && c<=122)
			{
				
				
				System.out.println("small character "+c);
				small++;
			}
			
			else
			{spec++;
				System.out.println("special character "+c);
			}
			
		}
		
		System.out.println("small char "+small);
		
		System.out.println("capital char "+cap);
		
		System.out.println("special char "+spec);
	}

}
