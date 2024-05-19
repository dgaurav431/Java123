class Program3
{
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		demo();
		System.out.println("main method ends");
	}
	public static void demo()
	{
		System.out.println("This is demo method");
		demo();
		
	}
}