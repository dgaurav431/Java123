package comparator;
public class Laptop {
	String name;
	int ram;
	double price;
	Laptop()
	{
		
	}
	Laptop(String name, int ram, double price)
	{
		this.name=name;
		this.ram=ram;
		this.price=price;
	}
	public String toString()
	{
		return "Name: "+name+" RAM: "+ram+" Price: "+price;
	}

}
