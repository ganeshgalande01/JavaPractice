
public class MissingNumFromArray {

	public static void main(String[] args) {
		int sum=0; int numsum=0;
		int arr[]= {1,2,3,4,6}; // here missing number is 5
		for(int a:arr)
		{
			sum=sum+a;
		}

		for(int i=1;i<=6;i++)
		{
			numsum=numsum+i;
		}
		
		int missingnum=numsum-sum;
		System.out.println("missing number in Array: "+missingnum);
	}

}
