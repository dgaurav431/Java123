//Take 3 input and print biggest
import java.util.Scanner;
class Program6
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
		if(a>b && a>c)
		{
			System.out.println("A is biggest and it is: "+a);
		}
		else if(b>=c)
		{
			if(b=c)
				System.out.println("B and c is biggest and it is: "+b);
			else
				System.out.println("B is biggest and it is: "+b);
		}
		else if(c>=b || c>=a )
		{
			System.out.println("c is biggest and it is: "+c);
		}
		else
		{
			System.out.println("All are Equal");
		}
	}
}















