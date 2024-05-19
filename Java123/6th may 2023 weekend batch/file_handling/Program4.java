package file_handling;
import java.io.*;
import java.util.*;
public class Program4 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		FileWriter fw=null;
		System.out.println("Give Input: ");
		String s1=sc.nextLine();
		
		try {
			fw=new FileWriter("f:\\p1.java");
			fw.write("this is file created by java program");
			fw.write(s1);
		} catch (IOException e) {
			
		}
		finally
		{
			fw.close();
			sc.close();
		}
	}

}
