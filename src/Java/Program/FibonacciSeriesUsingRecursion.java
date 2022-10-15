package Java.Program;

public class FibonacciSeriesUsingRecursion {

	public static void main(String[] args) {
		int val;
		for(int i=1;i<=10;i++)
		{
		val=fibo(i);
		System.out.println(val);
		}

	}
	
	static int fibo(int pos)
	{
		if(pos==1 || pos==2)
		{
			return 1;
		}
		else 
		{
		return fibo(pos-1)+ fibo(pos-2);
		
		}
	}

}
