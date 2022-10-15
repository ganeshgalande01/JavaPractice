package Java.Program;

public class RemoveWhiteSpacesString {

	public static void main(String[] args) {
		String s=" We lc   om e to j  av a ";

		String s1=s.replaceAll("\\s","");
		System.out.println(s1);
		
		RemoveWhiteSpacesString obj= new RemoveWhiteSpacesString();
		obj.getNumber();
	}
	
	public void getNumber()
	{
		String s="Welcome to java version 17";
		
		String s1=s.replaceAll("[^0-9]", "");
		System.out.println("number from string: "+s1);
	}

}
