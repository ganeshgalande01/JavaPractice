import java.util.Arrays;

public class ShiftAllZeroToRight {

	public static void main(String[] args) {
		int a[]= {1,0,2,0,4,7,0};// shift all zero to right
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	

	}

}
