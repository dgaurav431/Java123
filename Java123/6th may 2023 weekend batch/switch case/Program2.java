import java.util.Scanner;
class Program2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		int x=sc.nextInt();
		switch(x)
		{
				case 1:
							System.out.println("This is case-1");
							break;
				case 2:
							System.out.println("This is case-2");
							break;
				case 3:
							System.out.println("This is case-3");
							break;
				case 4:
							System.out.println("This is case-4");
							break;
				case 5:
							System.out.println("This is case-5");
							break;
				default:
							System.out.println("This is default case");
		}
	}
}