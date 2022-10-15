package FileOperations;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromFile {

	public static void main(String[] args) {
		char data[]= new char [1000];
		try {
			FileReader read= new FileReader("D:\\Work Space\\JavaParactice\\src\\FileOperations\\demo.txt");
		read.read(data);
		System.out.println("data read successfully");
		System.out.println(data);
		read.close();
		
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
