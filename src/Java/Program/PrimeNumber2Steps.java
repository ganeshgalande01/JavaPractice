package Java.Program;

public class PrimeNumber2Steps {

	public static void main(String[] args) {
		
		int num=155;
		while(num>0)
		{
			if(num%2!=0 && num%3!=0 && num%5!=0)
			{
				System.out.println("number is prime " +num);
				break;
			}
			
			else if(num==3|| num==5 || num==2)
			{
				System.out.println("number is prime " +num);
				break;
			}
			else System.out.println("Number is not prime "+num);
			break;
		}
		

	}

}
