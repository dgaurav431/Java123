import java.util.Scanner;
class Program1
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int b=sc.nextInt();
		int c=a+b;

		System.out.println("The sum of "+a+" and "+b+" is: "+c);
		

	}


}