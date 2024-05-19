package method_overloading;

public class Calculator {
	
	public static void sum(int x, int y)
	{
		System.out.println("int, int arg sum method");
		System.out.println("Sum is: "+(x+y));
	}
	public static void sum(int x, int y, int z)
	{
		System.out.println("int, int, int arg sum method");
		System.out.println("Sum is: "+(x+y+z));
	}
	public static void sum(int x, int y, int z, int p)
	{
		System.out.println("int, int, int, int arg sum method");
		System.out.println("Sum is: "+(x+y+z+p));
	}
	public static void sum(int x, double y)
	{
		System.out.println("int, double arg sum method");
		System.out.println("Sum is: "+(x+y));
	}
	public static void sum(double x, int y)
	{
		System.out.println("double, int arg sum method");
		System.out.println("Sum is: "+(x+y));
	}
	public static void sum(double x, double y)
	{
		System.out.println("double, double arg sum method");
		System.out.println("Sum is: "+(x+y));
	}
	public static void sum(int x, int y, double z)
	{
		System.out.println("int, int, double arg sum method");
		System.out.println("Sum is: "+(x+y+z));
	}
	public static void sum(int x, double y, double z)
	{
		System.out.println("int, double, double arg sum method");
		System.out.println("Sum is: "+(x+y+z));
	}
	

}













