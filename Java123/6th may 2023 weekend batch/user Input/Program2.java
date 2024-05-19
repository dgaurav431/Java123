import java.util.Scanner;
class Program2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		double a=sc.nextDouble();
		System.out.println("Enter the 2nd Number: ");
		double b=sc.nextDouble();
		double c=a+b;

		System.out.println("The sum of "+a+" and "+b+" is: "+c);
		

	}


}