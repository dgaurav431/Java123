//Take a number and print factorial
import java.util.Scanner;
class Program13
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
		i++;
		}
		System.out.println(n+"!= "+fact);
		
	}


}