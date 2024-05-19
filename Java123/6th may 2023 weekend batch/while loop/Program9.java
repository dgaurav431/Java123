//print all the numbers which is divided by 7 and also ends with 7
class Program9
{

	public static void main(String[] args)
	{
		int i=1;
		while(i<=100)
		{
			if(i%7==0 && i%10==7)
			{
				System.out.println(i);
			}
		i++;
		}

	}


}