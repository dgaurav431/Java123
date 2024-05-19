package exception;
import java.util.*;
public class Program10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a: ");
		int a=sc.nextInt();
		System.out.println("ENter b: ");
		int b=sc.nextInt();
		try {
		Program9.test(a, b);
		}
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("This is finally Block");
			sc.close();
		}
		System.out.println("program is completed");
		System.out.println("Thank You");
	}

}
