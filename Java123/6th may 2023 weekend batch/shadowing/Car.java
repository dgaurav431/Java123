package shadowing;

public class Car extends Vehicle{
	static int a=34;
	int b=54;
	
	public static void run()
	{
		System.out.println("run the Car");
	}

}
