package collection;

public class Car {
	String name;
	int price;
	String color;
	Car()
	{
		
	}
	Car(String name, int price, String color)
	{
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public String toString()
	{
		return "Name: "+name+" Price: "+price+" Color: "+color;
	}

}



