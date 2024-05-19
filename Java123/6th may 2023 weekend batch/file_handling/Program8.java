package file_handling;
import java.io.*;
import java.util.*;
public class Program8 {
	public static void main(String[] args) throws IOException {
		
		File f1=new File("f:\\p1.java");
		FileInputStream fis=new FileInputStream(f1);
		//System.out.println((char)fis.read());
		//System.out.println((char)fis.read());
		
		int x=fis.read();
		while(x!=-1)
		{
			System.out.print((char)x);
			x=fis.read();
		}
	}

}
