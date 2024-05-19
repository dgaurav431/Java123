class Program2
{
	public static void test()
	{
		System.out.println("This is test method");
	}
	public static void drive()
	{
		System.out.println("This is drive method");
		test();
		System.out.println("drive method ends");
	}
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		demo();
		System.out.println("main method ends");
	}
	public static void demo()
	{
		System.out.println("This is demo method");
		drive();
		System.out.println("demo method ends");
	}
}