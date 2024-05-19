package collection;
public class Shirt {
	String brand_name;
	int price;
	int size;
	String color;
	Shirt()
	{
		
	}
	Shirt(String brand_name, int price, int size, String color)
	{
		this.brand_name=brand_name;
		this.price=price;
		this.size=size;
		this.color=color;
	}
	public String toString()
	{
		return "Name: "+brand_name+" Price: "+price+" Size: "+size+" Color: "+color;
	}

}
