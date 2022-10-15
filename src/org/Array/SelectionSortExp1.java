package org.Array;

public class SelectionSortExp1 {

	public static void main(String[] args) {
		int arr[]={90,45,10,40,17,21};
		int temp;
		for (int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
		}
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(""+arr[i]);
			int len=arr.length-1;
			System.out.println(len);
		}
	}

}
