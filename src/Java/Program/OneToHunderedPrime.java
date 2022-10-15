package Java.Program;

public class OneToHunderedPrime {

	public static void main(String[] args) {
		
		int num=1;
		while(num<=100)
		{
			if(num%2!=0 && num%3!=0 && num%5!=0)
			{
				System.out.println("number is prime " +num);
				
			}
			
			else if(num==3|| num==5 || num==2)
			{
				System.out.println("number is prime " +num);
				
			}
			else System.out.println("Number is not prime "+num);
			
			num++;
		}
		

	}

}
