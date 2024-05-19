//print all the numbers which ends with 12 or 23
class Program8
{

	public static void main(String[] args)
	{
		int i=1;
		while(i<=500)
		{
			if(i%100==12 || i%100==23)
			{
				System.out.println(i);
			}
		i++;
		}

	}


}