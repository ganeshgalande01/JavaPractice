// How to count owvels from string 
public class CountOvalsFromString {

	public static void main(String[] args) {
		int count=0;
	String str="Welcome to java";
	char ch[]=str.toCharArray();
	for(char c:ch)
	{
		if(c=='a' || c=='e' || c=='i' ||c=='o' ||c=='u' ||c=='a' ||
				c=='A' ||c=='E' ||c=='I' ||c=='O' ||c=='U' )
		{
			count++;
			System.out.println("ovals from string : "+c);
		}
	}
	
	System.out.println("Total ovals from string : "+count);

	}

}
