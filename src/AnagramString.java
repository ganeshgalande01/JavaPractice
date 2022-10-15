import java.util.Arrays;

public class AnagramString {

	public static void main(String[] args) {
		System.out.println(isAnagramString("Spring","ingsp"));

	}
	
	public static boolean isAnagramString(String str1,String str2)
	{
		boolean flag= false;
		str1=str1.replaceAll(" ", "");
		str2=str2.replaceAll(" ", "");
		
		if(str1.length()!=str2.length())
		{
			flag=false;
		}
		
		else {
			char arr1[]=str1.toLowerCase().toCharArray();
			char arr2[]=str2.toLowerCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			flag=Arrays.equals(arr1,arr2);
		}
		return flag;
	}

}
