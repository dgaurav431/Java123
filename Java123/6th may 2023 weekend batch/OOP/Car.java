class Car
{
	static int x=23;
	int y=45;
	public static void main(String[] args)
	{
		System.out.println(x);
		System.out.println(Car.x);
		
		Car c1=new Car();
		System.out.println(c1.x);
		System.out.println(c1.y);



	}
}