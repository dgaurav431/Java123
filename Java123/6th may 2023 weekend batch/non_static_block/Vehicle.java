package non_static_block;
public class Vehicle {
	static
	{
		System.out.println("static-1");
	}
	{
		System.out.println("non-static-1");
	}
	Vehicle()
	{
		System.out.println("Vehicle is created");
	}
	{
		System.out.println("non-static-2");
	}
	static
	{
		System.out.println("static-2");
	}
}
