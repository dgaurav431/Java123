package file_handling;
import java.io.*;
import java.util.*;
public class Program5 {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		FileWriter fw=null;
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter age: ");
		int age=sc.nextInt();
		System.out.println("Enter Mobile Number: ");
		long number=sc.nextLong();
		try {
			fw=new FileWriter("f:\\p2.txt");
			fw.write("Name is: "+name+"\n");
			fw.write("Age is: "+age+"\n");
			fw.write("Mobile Number is: "+number);
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		finally
		{
			fw.close();
			sc.close();
		}
	}

}
