import java.util.Scanner;
class Program3
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	char c;
	do
	{
		System.out.println("Enter from the below Options: ");
		System.out.println("1========To Find===>Factorial");
		System.out.println("2========To Find===>Power");
		System.out.println("3========To Check===>Prime Number");
		int x=sc.nextInt();

		switch(x)
		{
				case 1:
							System.out.println("You selected find Factorial Operation");
							System.out.println("Enter the Number to find factorial: ");
							int y=sc.nextInt();							
							int fact=1;
							for(int i=1;i<=y;i++)
							{
									fact=fact*i;
							}
							System.out.println(y+"!= "+fact);
							break;
				case 2:
							System.out.println("You selected find Power Operation");
							System.out.println("Enter a: ");
							int a=sc.nextInt();
							System.out.println("Enter b: ");
							int b=sc.nextInt();						
							int pow=1;
							for(int i=1;i<=b;i++)
							{
									pow=pow*a;
							}
							System.out.println(a+" to power "+b+" is: "+pow);
							break;
				case 3:
							System.out.println("You selected check Prime Operation");
							System.out.println("Enter the Number: ");
							int n=sc.nextInt();							
							int count=0;
							for(int i=2;i<=n/2;i++)
							{
									if(n%i==0)
									{
										count++;
										break;
									}
							}
							if(count==0)
							{
									System.out.println(n+" is a prime Number");
							}
							else
							{
									System.out.println(n+" is not a prime Number");
							}
							break;
				
				default:
							System.out.println("This is not a valid Input! Please Enter a valid Number from the Option");
		}
		System.out.println("Press Y/y to continue or any other character to stop");
		c=sc.next().charAt(0);
		}while(c=='Y' || c=='y');
		System.out.println("Thank You!! Program is completed");
	}
}










