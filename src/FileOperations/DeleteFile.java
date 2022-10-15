package FileOperations;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		File file = new File("D:\\Work Space\\JavaParactice\\src\\FileOperations\\demo2.txt");
		
		
		if(file.delete())
		{
			System.out.println(""+file.getName()+" is deleted");
		}
	}

}
