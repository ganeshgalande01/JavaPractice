import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		
		System.out.println( isStringAnagram("Spr ing", "gnirpS"));

	}
	
	public static boolean isStringAnagram(String str1, String str2)
	{
		boolean flag=false;
		str1=str1.replaceAll(" ", "");
		str2=str2.replaceAll(" ", "");
		if(str1.length()!=str2.length())
		{
			flag=false;
			return flag;
		}
		
		else {
			
			char arr1[]=str1.toUpperCase().toCharArray();
			char arr2[]=str2.toUpperCase().toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr1);
			flag=Arrays.equals(arr1, arr2);
			return flag;
		}
		
	}

}
