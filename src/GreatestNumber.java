
public class GreatestNumber {

	public static void main(String[] args) {
		GreatestNumber obj= new GreatestNumber();
		obj.greatestNum(15,10);

	}
	
	public void greatestNum(int a,int b)
	{
		if(a>b)
		{
			System.out.println("a is greater="+a);
		}
		
		else if(a==b)
		{
			System.out.println("a and b value is same"+a+" "+b);
		}
		
		else System.out.println("b is greater ="+b);
	}

}
