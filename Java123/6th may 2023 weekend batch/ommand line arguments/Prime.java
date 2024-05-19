class Prime
{
		public static void main(String[] args)
		{
			int x=Integer.parseInt(args[0]);
			checkPrime(x);	
		}
		public static void checkPrime(int n)
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
			if(count==0){System.out.println(n+" is a prime number");}
			else{System.out.println(n+" is not a prime number");}
		}
}











