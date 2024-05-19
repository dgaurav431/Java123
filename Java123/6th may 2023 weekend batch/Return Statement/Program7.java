//check whether a number is perfect or not
import java.util.Scanner;
class Program7
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");	
		int n=sc.nextInt();
		if(checkPerfect(n))
		{
			System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+" is not a perfect number");
		}
	}
	public static boolean checkPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}










