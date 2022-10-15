package Java.Program;

public class SumOfArray {

	public static void main(String[] args) {
		int arr[]= {12,11,10,15,20};
		int sum=0;
		for (int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			
		}
		System.out.println("Sum of Array "+sum);
	}

}
