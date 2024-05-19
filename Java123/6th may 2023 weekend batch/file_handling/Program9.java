package file_handling;
import java.io.*;
import java.util.*;
public class Program9 {
	public static void main(String[] args) throws FileNotFoundException {
		
		File f1=new File("f:\\p1.java");
		
		Scanner sc=new Scanner(f1);
		//System.out.println(sc.nextLine());
		//System.out.println(sc.nextLine());
		//System.out.println(sc.hasNextLine());
		while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}

}
