package non_static_block;

public class Car {
	
	{
		System.out.println("Non-static block-1");
	}
	public static void main(String[] args) {
		System.out.println("This is main method");
		Car c1=new Car();
		System.out.println("=============");
		Car c2=new Car();
		System.out.println("=============");
		Car c3=new Car();
	}
	static
	{
		System.out.println("Static block-1");
	}
	{
		System.out.println("Non-static block-2");
	}

}
