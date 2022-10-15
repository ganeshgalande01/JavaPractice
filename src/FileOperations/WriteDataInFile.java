package FileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class WriteDataInFile {

	public static void main(String[] args) {
		String data="Ganesh, 9158465659,pune,galandeganesh1@gamail.com";
		
		try {
			FileWriter out= new FileWriter("D:\\Work Space\\JavaParactice\\src\\FileOperations\\demo.txt");
			out.write(data);
			System.out.println("Data is written successfully");
			out.close();
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
