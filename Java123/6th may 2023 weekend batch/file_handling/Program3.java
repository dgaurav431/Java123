package file_handling;
import java.io.*;
public class Program3 {
	public static void main(String[] args) throws IOException {
		File f1=new File("f:\\");
		
		f1.createNewFile();
		
		File[] x=f1.listFiles();
		for(File p:x)
		{
			System.out.println(p);
		}
		
		
	}

}
