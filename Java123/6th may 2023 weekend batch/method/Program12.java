//print prime upto 100
class Program12
{
	
	public static void main(String[] args)
	{
		System.out.println("This is program11");
		for(int i=2;i<=100;i++)
		{
			printPrime(i);
		}
		
	}
	public static void printPrime(int n)
	{
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
			System.out.print(n+"    ");
		}
	}
	
}









