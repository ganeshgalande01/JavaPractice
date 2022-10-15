package org.Array;

public class SingleDimensionalArray {

	public static void main(String[] args) {
		int arr[]= new int[5];
		arr[0]=123;
		arr[1]=111;
		arr[2]=10;
		arr[3]=101;
		arr[4]=100;
		
		/*for (int i=0;i<arr.length;i++)
		{
			System.out.println("arry values ="+arr[i]);
		}*/
		
		for(int i:arr)
		{
			System.out.println(i);
		}

	}

}
