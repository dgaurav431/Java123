//print and count all the perfect number
class Program8
{
	public static void main(String[] args)
	{	
		int count=0;
		for(int i=1;i<=100000;i++)
		{
			if(checkPerfect(i))
			{
				System.out.print(i+"   ");
				count++;
			}
		}
		System.out.println("\nTotal perfect numbers are: "+count);
	}
	public static boolean checkPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}










