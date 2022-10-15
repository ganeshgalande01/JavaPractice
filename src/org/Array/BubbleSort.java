package org.Array;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]={9,4,3,8,6};
		
		//int temp;
		int n=arr.length;
		
		System.out.println("before sorting array="+Arrays.toString(arr));
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
			//System.out.println("sorted array="+Arrays.toString(arr));
		
		for(int i=0;i<n-1;i++)
		{
			System.out.println("sorted Array="+arr[i]);
		}
		
		
	}

}
