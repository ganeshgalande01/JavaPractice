import java.util.HashSet;
import java.util.Set;

public class DuplicateElementFrombothArray {

	public static void main(String[] args) {
		int arr1[]= {10,11,12,13,67};
		int arr2[]= {10,11,78,66,89};
		findSimilar(arr1,arr2);

	}
	
	public static void findSimilar(int arr1[], int arr2[])
	{
		Set<Integer> s1= new HashSet<>();
		for(int i=0;i<arr1.length;i++)
		{
			s1.add(arr1[i]);
		}
		
		
		for(int i=0;i<arr2.length;i++)
		{
			if(s1.contains(arr2[i]))
			{
				System.out.println("similar element from both array "+arr2[i]);
			}
		}
	}

}
