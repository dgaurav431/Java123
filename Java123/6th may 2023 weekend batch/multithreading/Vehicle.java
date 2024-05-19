package multithreading;
public class Vehicle extends Thread{
	String name;
	int price;
	String color;
	Vehicle()
	{
	}
	Vehicle(String name, int price, String color)
	{
		this.name=name;this.price=price;this.color=color;
	}
	@Override
	public void run()
	{
		System.out.println("run method is overridden");
		System.out.println("run method starts");
		displayVehicle();
		System.out.println("===========run method ends==============");
	}
	public void displayVehicle()
	{
		System.out.println("name is: "+name);
		System.out.println("price is: "+price);
		System.out.println("color is: "+color);
		System.out.println("===================");
	}
	

}
