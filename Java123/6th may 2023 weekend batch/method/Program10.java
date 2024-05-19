class Program10
{
	
	public static void main(String[] args)
	{
		System.out.println("This is program10");
		findFactorial(6);
		findFactorial(8);
		findFactorial(4);
		
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