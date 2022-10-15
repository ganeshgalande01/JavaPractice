
public class MissingNum {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,6};
		int sum=0;
		int totalnumsum=0;
		for(int a:arr)
		{
			sum=sum+a;
		}
		System.out.println(sum);
		
		for(int i=1;i<=6;i++)
		{
			totalnumsum=totalnumsum+i;
		}
		
		int missingnum=totalnumsum-sum;
		System.out.println(missingnum);
		
	}

}
