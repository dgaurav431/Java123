class Program5
{
	public static void main(String[] args)
	{
		int[] itemcount=new int[5];
		itemcount[0]=2;
		itemcount[1]=4;
		itemcount[2]=1;
		itemcount[3]=3;
		itemcount[4]=2;
		
		double[] price={530, 1200, 125.4, 400.5, 300};

		double x=itemcount[0]*price[0]+itemcount[1]*price[1]+itemcount[2]*price[2]+itemcount[3]*price[3]+itemcount[4]*price[4];
		
		System.out.print("Total price is: ");
		System.out.println(x);
	}
}