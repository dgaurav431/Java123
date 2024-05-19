class Program10
{
	public static void main(String[] args)
	{
		String[] p={"John", "Shaktiman", "Jethalal", "Babita Ji", "Popat lal", "14256", "3476.688"};		
		System.out.println("Elements are Below");
		for(String x:p)
		{
			System.out.println(x);
		}
		System.out.println("Each Element length is Below");
		for(String x: p)
		{
			System.out.println(x.length());
		}
		System.out.println("Each Element length is Below");
		for(String x: p)
		{
			System.out.println("The Length of "+x+" is: "+x.length());
		}
	}


}