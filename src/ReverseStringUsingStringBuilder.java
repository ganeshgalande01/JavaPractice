
public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		String str="Welcome to java";
		
		StringBuilder sb= new StringBuilder(str);
		sb.reverse();
		System.out.println("Reverse string is : "+sb);
	}

}

//output : avaj ot emocleW
