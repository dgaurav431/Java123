//print and count all the factors of a number
import java.util.Scanner;
class Program11
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int n=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=n/2)
		{
			if(n%i==0)
			{
				System.out.print(i+"    ");
				count++;
			}
		i++;
		}
		System.out.println("\nTotal factors of "+n+" are: "+count);
	}


}