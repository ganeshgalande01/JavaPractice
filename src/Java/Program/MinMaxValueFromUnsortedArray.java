package Java.Program;

public class MinMaxValueFromUnsortedArray {

	public static void main(String[] args) {
		   
        int arr[]={10,56,20,30,};
        
       int min=Integer.MAX_VALUE;
       for(int ele:arr)
       {
           if(ele<min)
           min=ele;
       }
      
        System.out.println(min);
        
        maxValue();
     }
	
	public static void maxValue()
	{
		int arr[]= {78,90,34,12,54};
		
		int max=Integer.MIN_VALUE;
	      for(int ele:arr)
	      {
	          if(ele>max)
	          max=ele;
	      }
	     
	       System.out.println(max);
	}
	  
    
     

	}


