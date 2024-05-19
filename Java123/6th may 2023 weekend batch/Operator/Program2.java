//Take a user input and print the no. is Even or Odd
import java.util.Scanner;
class Program2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int x=sc.nextInt();
		String s1=(x%2==0)?"The Number is Even":"The Number is Odd";
		System.out.println(s1);
		

	}


}