package org.Array;

public class MultiDimensional {

	public static void main(String[] args) {
		int arr[][]={{10,20,30},{40,50,60},{70,80,90}};
		
		/*
		String arr[][]=new String [3][3];
		arr[0][0]="ab";
		arr[0][1]="cd";
		arr[0][2]="ef";
		arr[1][0]="hell";
		arr[1][1]="hll";
		arr[1][2]="hh";
		arr[2][0]="ac";
		arr[2][1]="gg";
		arr[2][2]="jj";*/
		
		for(int i=0;i<3;i++)
		{
			for( int j=0;j<3;j++)
			{
				System.out.println(arr[i][j]);
			}
			
			System.out.println("");
		}
	}

}
