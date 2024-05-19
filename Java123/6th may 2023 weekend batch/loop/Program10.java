//count all the numbers which is divided by 7 and also ends with 7 upto 100
class Program10
{
	public static void main(String[] args)
	{
		int i=1;
		int count=0;
		while(i<=1000)
		{
			if(i%7==0 && i%10==7)
			{
				System.out.print(i+"    ");
				count++;
			}
		i++;
		}
		System.out.println("\nTotal such numbers are: "+count);
	}


}