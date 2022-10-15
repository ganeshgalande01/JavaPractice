package Java.Program;

public class DuplicateElementArray {

	public static void main(String[] args) {
		String arr[]= {"C#","C#","python","C#","java"};
		int count=0;
		int i;
		for( i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					count++;
					System.out.println("Duplicate element is "+arr[i]);
					
				}
								
			}
		}
		
		System.out.println(count+" times "+arr[0]+ " is reapted");

	}

}
