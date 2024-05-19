//Take a user input and print the last digit
import java.util.Scanner;
class Program1
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int x=sc.nextInt();
		int y=x%10;
		System.out.println("The Last digit of "+x+" is: "+y);
		

	}


}