import java.util.HashSet;

// find out duplicate element in array using HashSet 
public class DuplicateElementInArray {

	public static void main(String[] args) {
		
		int arr[]= {11,13,23,67,80,13,67};
		HashSet<Integer> hs= new HashSet<>();
		for(int element:arr)
		{
			if(!hs.add(element))
			{
				System.out.println("Duplicate element from Array: "+element);
			}
		}

	}

}
