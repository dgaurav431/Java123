class Program6
{
	
	public static void main(String[] args)
	{
		System.out.println("This is program6");
		findFactorial();
		
	}
	public static void findFactorial()
	{
		int n=6;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(n+"!= "+fact);
	}
	
}