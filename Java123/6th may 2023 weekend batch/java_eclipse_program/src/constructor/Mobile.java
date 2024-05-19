package constructor;
public class Mobile {
	String name;
	int ram_size;
	double price;
	Mobile(String name, int ram_size, double price)
	{
		this.name=name;
		this.ram_size=ram_size;
		this.price=price;
	}
	public void seeDetails()
	{
		System.out.println("Name is: "+name);
		System.out.println("RAM Size is: "+ram_size+"GB");
		System.out.println("Price of Mobile is: "+price);
		System.out.println("=========================");
	}

}
