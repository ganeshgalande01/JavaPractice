
public class MinMaxElementFromArray {

	public static void main(String[] args) {
		System.out.println("program start");
		int arr[]= {11,56,89,90,34,13};
		int min=0;
		int max=Integer.MAX_VALUE;
		for(int ele:arr)
		{
			if(ele>max)
			{
				min=ele;
				System.out.println(min);	
			}
		}


	}

}
