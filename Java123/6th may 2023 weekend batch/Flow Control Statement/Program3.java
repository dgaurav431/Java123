//take use input and print whether the enterd number is 3 digit number or not
import java.util.Scanner;
class Program3
{

	public static void main(String[] args)
	{
		System.out.println(015);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int x=sc.nextInt();
		if(x>=100 && x<=999)
		{
			System.out.println("It is a 3 digit number");
			
		}
		else
		{
			System.out.println("It is not 3 digit number");
		}
	}


}