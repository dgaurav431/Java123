class Program3
{
	public static void main(String[] args)
	{
		
		int x=test()+50;
		System.out.println(x);
		System.out.println("============================");
		int y=(test()+50+test());
		System.out.println("The sum is: "+y);
		

	}
	public static int test()
	{
		System.out.println("This is test method");
		int a=40;
	return a+20;
	}
}