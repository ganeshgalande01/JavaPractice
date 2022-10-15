package Java.Program;

import java.util.Arrays;

public class MergeTwoArray {

	public static void main(String[] args) {
		int a[]= {10,30,14,27};
		int b[]= {45,76,89,90,78,79};
		int c[]= new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
		c[i]=a[i];	
		}
		
		
		for(int i=0;i<b.length;i++)
		{
		c[a.length+i]=b[i];	
		}
		
		System.out.println(Arrays.toString(c));
	}

}
