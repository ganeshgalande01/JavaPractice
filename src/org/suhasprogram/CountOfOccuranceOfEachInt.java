package org.suhasprogram;

public class CountOfOccuranceOfEachInt {

	public static void main(String[] args) {
		int arr[]= {1,0,9,0,6,7,7,0,0};
		//int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					
					System.out.println("number of time each int occur "+arr[i]+" ");
					
				}
			
				
			}
		}

	}

}
