package org.suhasprogram;

public class ArmStrong {

	public static void main(String[] args) {
		int num,a,sum=0;
		num=153;
		int temp=num;
		while(num>0)
		{
			a=num%10;
			sum=sum+(a*a*a);
			num=num/10;
		}
		
			if(temp==sum)
			{
				System.out.println("number is Armstrong");
			}
			
			else {
				System.out.println("number is not Armstrong");
			}
	}

}
