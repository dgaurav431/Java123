//Take a number and print factorial
import java.util.Scanner;
class Program14
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		System.out.println("Total Digit is: "+count);
		
	}


}