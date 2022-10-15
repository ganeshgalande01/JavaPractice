// remove junk or special character from string 
public class RemoveSpecialcharFromString {

	public static void main(String[] args) {
		String str="Welcome@#$%^&*() to java 12344567";
		String str1=str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str1);
		
		

	}

}
