import java.util.Scanner;
class Program8
{
	
	public static void main(String[] args)
	{
		findPower();
		
	}
	public static void findPower()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter a: ");
		int a=sc.nextInt();
		System.out.println("ENter b: ");
		int b=sc.nextInt();
		int pow=1;
		for(int i=1;i<=b;i++)
		{
			pow=pow*a;
		}
		System.out.println(a+" to power "+b+" is: "+pow);
	}
}