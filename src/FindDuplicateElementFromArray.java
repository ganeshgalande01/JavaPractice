
public class FindDuplicateElementFromArray {

	public static void main(String[] args) {
		int arr[]= {2,3,6,2,3,6,11,23};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) 
				{
					System.out.println("Duplicate elements in array : "+arr[i]);
				}
			}
		}

	}

}
