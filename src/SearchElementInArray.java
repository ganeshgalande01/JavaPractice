
public class SearchElementInArray {

	public static void main(String[] args) {
		int arr[]= {11,34,23,89};
		System.out.println(isElementPresentInArray(arr,22));
	}
	
	public static boolean isElementPresentInArray(int arr[],int element )
	{
		boolean flag=false;
		for(int ele:arr)
		{
			if(ele==element)
			{
				flag=true;
			}
		}
	
		return flag;
	}

}
