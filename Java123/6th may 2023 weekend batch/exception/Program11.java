package exception;
import java.io.*;
public class Program11 {
	public static void main(String[] args) throws InterruptedException  {
			
			for(int i=1;i<=10;i++)
			{
				System.out.println(i);
				Thread.sleep(1200);
			}
				
			
	}
	public static void test() throws FileNotFoundException
	{
		FileInputStream fis =new FileInputStream("f://java.txt");
		throw new ArithmeticException();
	}

}
