import java.util.Scanner;

public class palindrom {

	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Plese Enter Number");
			int num=sc.nextInt();
			int temp=num;
			int rev=0;
			while(num>0)
			{
				rev=rev*10+num%10;
				num=num/10;
			}
			System.out.println("reverse number is"+rev);
			if (temp==rev)
			{
				System.out.println("Number is Palindrome");
			}
			else 
			{
				System.out.println("Number is not Palindrome");
				
			}
				
		}
	}