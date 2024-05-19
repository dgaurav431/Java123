package file_handling;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;
public class Program7 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		File f1=new File("f:\\p4.txt");
		f1.createNewFile();
		
		FileOutputStream fos=new FileOutputStream(f1);
		System.out.println("ENter the String:  ");
		String s1=sc.nextLine();
		fos.write(s1.getBytes());
	}

}
