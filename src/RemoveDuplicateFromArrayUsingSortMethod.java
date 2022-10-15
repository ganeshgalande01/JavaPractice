import java.util.Arrays;

public class RemoveDuplicateFromArrayUsingSortMethod {

	public static void main(String[] args) {
		int arr[]= {11,34,11,23,34,90,90};
		Arrays.sort(arr);
		for(int i=0;i<=arr.length;i++)
		{
			if(arr[i]==arr[i+1])
			{
				System.out.println("duplicate element in array : "+arr[i]);
			}
		}

	}

}
