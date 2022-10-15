package Java.Program;

public class RemoveWhiteSpacesFromString {

	public static void main(String[] args) {
		String str="Welcome to java";
		String s1=str.replaceAll(" ", "");
		System.out.println("After removing space from string: "+s1);

	}

}
