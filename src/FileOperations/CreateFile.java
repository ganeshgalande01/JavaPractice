package FileOperations;

import java.io.File;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) {
		File file= new File("D:\\Work Space\\JavaParactice\\src\\FileOperations\\demo.txt");
		try {
			if(file.createNewFile())
			{
				System.out.println("File is created");
			}
			else {
				System.out.println("something is wrong in file creation");		}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
			
		}
	}


