package Java.Program;

public class FiboSeries {

	public static void main(String[] args) {
		int num=10;
		int x=1,y=1;
		System.out.println(x);
		
		while(y<num)
		{
			System.out.println(y);
			
			int temp=x;
			x=y;
			y=temp+x;
			
			
			
		}
		fibo();
	}
	
	public static void fibo()
	{
		int num=10;
		int n1=1;int n2=1;
		System.out.println(n1);
		//System.out.println(n2);
		
		while(n2<=num)
		{
			System.out.println(n2);
			int temp=n1;
			n1=n2;
			n2=temp+n1;
			
		}
		
	}
	
	

}
