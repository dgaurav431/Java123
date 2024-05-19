package exception;
import java.util.Scanner;
public class Program8 {
	public static void main(String[] args) {
		int[] x= {12, 34, 0, 45, 64};
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("ENter n: ");
			int n=sc.nextInt();
			System.out.println(x[n]);
			System.out.println("ENter n1: ");
			int n1=sc.nextInt();
			System.out.println(x[1]/x[n1]);
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException e)
		{
			System.out.println("Array index is out of range");
			System.out.println(e);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Divided by Zero");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Any other exception is caught");
			System.out.println(e);
		}
		System.out.println("Program Ends");
	}

}







