
public class SmallestAndLargestElementInArray {

	public static void main(String[] args) {
		int arr[]= {0,34,23,12,78,90};
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		System.out.println("smallest element in array: "+arr[0]);
		System.out.println("highest element in array: "+arr[arr.length-1]);
		

	}

}
