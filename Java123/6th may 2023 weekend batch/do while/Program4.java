import java.util.Scanner;
class Program4
{

	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	int x;
	do
	{
		System.out.println("Enter the Number: ");
		int n=sc.nextInt();
		int fact=1;
		int i=1;
		while(i<=n)
		{
			fact=fact*i;
			i++;
		}
		System.out.println(n+"!= "+fact);
		System.out.println("Press 1 to continue or any other number to Stop!");
		x=sc.nextInt();

	}while(x==1);
	System.out.println("Thank You!! Program is completed!");
	}


}








