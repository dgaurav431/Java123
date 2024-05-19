package exception;
import java.io.*;
public class Program5 {
	public static void main(String[] args) {
		
		try
		{
			FileInputStream fis =new FileInputStream("f://java.txt");
			System.out.println("File is Found at location");
		}
		catch(Exception e)
		{
			System.out.println("File is not availaible");
		}
	}

}
