// Different ways to find length of string 
public class FindLength {

	public static void main(String[] args) {
		String str="Testing";
		// way1
		System.out.println(str.toCharArray().length); // length is not method here 
		// way2
		System.out.println(str.split("").length);
		// way3
		System.out.println(str.lastIndexOf(""));

	}

}
