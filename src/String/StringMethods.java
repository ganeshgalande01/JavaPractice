package String;

public class StringMethods {

	public static void main(String[] args) {
		String str="Welcome to java"; // string constant pool
		String str2="welcome";
		
		String str1= new String("Subbarao"); // heap area
		
		
		String con=str.concat(str1); //Welcome+Subbarao
		char ch=str1.charAt(0);// S
		
		int bl=str.compareTo(str1); // 4
		System.out.println(bl);
		
		int indexnum=str.indexOf('e'); // return 1
		
		boolean flag=str.equals(str1);// false
		
		System.out.println(str==str1); // false 
		System.out.println(str==str2); // true
		
		boolean fl=str.equalsIgnoreCase(str2);// true
		
		str.toUpperCase(); // it will make all char into upper case
		str.toLowerCase(); // it will make all char into lower case
		
		char ch1[]=str.toCharArray();
		
		String arr[]=str.split(" ");
		
		StringBuffer sb= new StringBuffer("Wecome");
		
		sb.reverse();
		System.out.println(sb);
		
		sb.append('h');
		System.out.println(sb);
		
		
		
		
		
		
		
		
		

	}

}
