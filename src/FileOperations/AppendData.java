package FileOperations;

import java.io.FileWriter;
import java.io.IOException;

public class AppendData {

	public static void main(String[] args) {
		String data="This is appended data to file";
		try {
			FileWriter out= new FileWriter("D:\\Work Space\\JavaParactice\\src\\FileOperations\\demo.txt",true);
			out.write(data);
			System.out.println("data appended successfully");
			out.close();
		
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
