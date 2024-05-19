//Take a number and print each digit from end
import java.util.Scanner;
class Program15
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		int count=0;
		while(n>0)
		{
			int x=n%10;
			System.out.println(x);
			n=n/10;
		}
		
	}


}