class Program11
{
	
	public static void main(String[] args)
	{
		System.out.println("This is program11");
		for(int i=1;i<=15;i++)
		{
			findFactorial(i);
		}
		
	}
	public static void findFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(n+"!= "+fact);
	}
	
}