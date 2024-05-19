package file_handling;
import java.io.*;
public class Program1 {
	public static void main(String[] args) {
		File f1=new File("f:\\abc.txt");
		try 
		{
			if(!f1.exists())
			{
				f1.createNewFile();
				System.out.println("FIle is created");
			}
			
		} catch (IOException e) 
		{
			System.out.println("Specified location is not found");
		}
		System.out.println(f1.exists());
		
		
		
	}

}
