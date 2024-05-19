//Take a user input and print whether the last two digit is divided by 7 or not
import java.util.Scanner;
class Program3
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int x=sc.nextInt();
		int y=x%100;
		String s1=(y%7==0)?"The last two digit is div. by 7":"The last two digit is not div. by 7";
		System.out.println(s1);
		

	}


}