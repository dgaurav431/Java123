package constructor;
public class Fruit {
	String name;
	int price;
	String color;
	Fruit()
	{
		
	}
	Fruit(String name, int price, String color)
	{
		this.name=name;
		this.price=price;
		this.color=color;
	}
	Fruit(Fruit f)
	{
		this(f.name,f.price, f.color);
		//this.name=f.name;
		//this.price=f.price;
		//this.color=f.color;
		
	}
	public void displayDetails()
	{
		System.out.println("Name is: "+name);
		System.out.println("price is: "+price);
		System.out.println("Color is: "+color);
		System.out.println("===================");
	}

}
