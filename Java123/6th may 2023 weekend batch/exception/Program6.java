package exception;
import java.util.*;
public class Program6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a: ");
		int a=sc.nextInt();
		System.out.println("Enter b: ");
		int b=sc.nextInt();
		System.out.println(12+45*2+a+b);
		System.out.println(a/4+b/14);
		try {
			System.out.println("The result of "+a+"/"+b+" is: "+a/b);
			System.out.println("Inside try block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("The result of "+a+"/"+b+" is Infinity");
		}
		System.out.println(30+40*4+a);
		System.out.println("Program ends");
	}
}