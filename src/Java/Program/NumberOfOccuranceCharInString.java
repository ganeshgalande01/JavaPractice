package Java.Program;

public class NumberOfOccuranceCharInString {

	public static void main(String[] args) {
		String s="Welcome to java";
		
		int totallen=s.length();
		int len=s.replace("t", "").length();
		int t=totallen-len;
		System.out.println("number of times a occur in String: "+t);

	}

}
