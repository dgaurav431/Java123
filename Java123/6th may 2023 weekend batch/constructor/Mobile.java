package constructor;
public class Mobile {
	String name;
	int ram_size;
	double price;
	String color;
	Mobile()
	{
		System.out.println("Mobile Obje is created");
	}
	Mobile(String name)
	{
		this.name=name;
	}
	Mobile(int ram_size)
	{
		this.ram_size=ram_size;
	}
	Mobile(int price,String color)
	{
		this.price=price;
		this.color=color;
	}
	Mobile(String name, int ram_size)
	{
		this.name=name;
		this.ram_size=ram_size;
	}
	Mobile(String name, int ram_size, double price)
	{
		this.name=name;
		this.ram_size=ram_size;
		this.price=price;
	}
	Mobile(String name, int ram_size, double price, String color)
	{
		this(name, ram_size, price);
		this.color=color;
	}
	public void seeDetails()
	{
		System.out.println("Name is: "+name);
		System.out.println("RAM Size is: "+ram_size+"GB");
		System.out.println("Price of Mobile is: "+price);
		System.out.println("Color of Mobile is: "+color);
		System.out.println("=========================");
	}

}
