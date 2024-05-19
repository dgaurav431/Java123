class Fruit
{
	static int x=34;
	int y=50;	
	public static void demo()
	{
		System.out.println("This is demo method");
		Fruit f1=new Fruit();
		System.out.println(f1.y);
		f1.run();
	}
	public static void test()
	{
		System.out.println("This is test method");
		System.out.println(x);
		demo();	
	}
	public  void run()
	{
		System.out.println("This is run method");
	}
	public  void start()
	{
		System.out.println("This is start method");
		System.out.println(y);
		run();
		System.out.println(x);
		demo();
	}

	public static void main(String[] args)
	{
		System.out.println("This is main method");
		test();
		System.out.println("=============================");
		Fruit f1=new Fruit();
		f1.start();
	}
}








