//Take 3 input and print biggest or which two are equal number is biggest     or all are equal with the value
import java.util.Scanner;
class Program7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd Number: ");
		int c=sc.nextInt();
		if(a>=b && a>=c)
		{
			if(a==b && a==c)
			{
				System.out.println("all are equal with value "+a);
			}
			else if(a==b)
			{
				System.out.println("a and b are largest and equal with value "+a);
			}
			else if(a==c)
			{
				System.out.println("a and c are largest and equal with value "+a);
			}
			else
			{
				System.out.println("a is largest with value "+a);
			}
		}
		else if(b>=c)
		{
			if(b==c)
			{
				System.out.println("b and c are largest and equal with value "+b);
			}
			else
			{
				System.out.println("b is largest with value "+b);
			}
		}
		else
		{
			System.out.println("c is largest with value "+c);
		}
	}
}