package Java.Program;

//import java.util.Scanner;

public class OvelsFromString {

	public static void main(String[] args) {
		//System.out.println("Enter string");
		//Scanner sc= new Scanner(System.in);
		String str="Welcome to java";
		int ovelcount=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u')||(ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||
					(ch=='U'))
			{
				System.out.println(ch+" ");
				ovelcount++;
			}
		}
		System.out.print("total oval in string "+ovelcount);
		
	}
}
