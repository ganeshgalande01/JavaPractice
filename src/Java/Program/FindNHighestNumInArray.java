package Java.Program;

public class FindNHighestNumInArray {

	public static void main(String[] args) {
	      int arr[]={10,56,20,30,78,60};
	       
	       for(int i=0;i<arr.length;i++)
	       {
	           for(int j=i+1;j<arr.length;j++)
	           {
	               if(arr[i]>arr[j])
	               {
	               int temp=arr[i];
	               arr[i]=arr[j];
	               arr[j]=temp;
	               }
	               
	           }
	       }
	        
	        for(int i=0;i<arr.length;i++)
	        { }
	        System.out.println("Higest element in Array "+arr[arr.length-1]);
	        System.out.println("Lowest element in Array "+arr[arr.length-arr.length]);
	     }

	}


