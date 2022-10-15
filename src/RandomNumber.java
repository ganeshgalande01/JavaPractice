import java.util.Random;

public class RandomNumber {
// how to generate random number in java
	public static void main(String[] args) {
	 Random rnd= new Random();
	 int randomnum=rnd.nextInt(10); // it will generate any number from 0 to 10
	 System.out.println(randomnum);
	 

	}

}
