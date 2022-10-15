package ArrayProblems;

public class GetArrayIndexOfParticularElement {

	public static void main(String[] args) {
		
		
		System.out.println(arrayElementPosition(12));
	}
	
	  int i; int position=0; 
	 public static int arrayElementPosition(int element)
	    {
	        int i; int position=0;
	       int arr[]={10,11,12,13,14};
	       for( i=0;i<arr.length;i++)
	       {
	          if(arr[i]==element)
	          {
	              position =i; 
	          }
	          
	          else
	          {
	              return -1;
	          }
	       }
	       
	       return position;
	    }

}
