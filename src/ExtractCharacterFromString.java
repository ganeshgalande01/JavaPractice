
public class ExtractCharacterFromString {

	public static void main(String[] args) {
		String str="Welcome to java7979@#$%&";
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			if(Character.isAlphabetic(c))
			{
				System.out.println("All char from string: "+c);
			}
		}

	}

}
