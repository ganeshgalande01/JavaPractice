package org.Array;

import java.util.Arrays;

public class BubbleSort1 {

	public static void main(String[] args) {
		int arr[]={3,5,1,9,4,};
		
		int n=arr.length;
		for (int i=0;i<n-1;i++)// index  0,1,
		{
			for (int j=0;j<n-1;j++) // values 0,1,
			{
				if(arr[j]>arr[j+1])// 0, 1,
				{
					System.out.println(arr[j]+" "+arr[j+1]);
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					}
				
			}
			
		}
		
		/*for (int i=0;i<n;i++)
		{
			System.out.println("sorted array="+arr[i]);
		}*/
		
		System.out.println(Arrays.toString(arr));
		
	}

}
