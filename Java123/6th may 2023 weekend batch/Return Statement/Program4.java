import java.util.Scanner;
class Program4
{
	public static void main(String[] args)
	{
		
		int x=test()+50;
		System.out.println("From main x is: "+x);
		
		

	}
	public static int test()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value: ");
		int x=sc.nextInt();
		int a=40;
		if(x>a)
		{
			System.out.println("Inside if block");
			
		}
	return a+20;
	}
}