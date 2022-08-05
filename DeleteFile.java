package phaseproject;
import java.io.File;
import java.util.Scanner;

public class DeleteFile {

	public void deleteTheFile(String path) {
		

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter file name to delete file with file type  (File name is case sensitive. so,carefully enter the fuile name)");
		String filename=sc.nextLine();
		String filepath=path+filename;
		
		File file=new File(filepath);
		
		if(file.delete()) 
			System.out.println("file deleted successfully");
		else 
			System.out.println("File not Found");
		
	}

}