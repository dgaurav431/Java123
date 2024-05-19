package has_a_relationship;

public class Car {
	String name;
	double price;
	Engine e=new Engine(60, 6, "diesel");
	Car()
	{
		
	}
	Car(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
	Car(String name, double price, Engine e)
	{
		this(name, price);
		this.e=e;
	}
	public void displayCar()
	{
		System.out.println("Car name is: "+name);
		System.out.println("Car Price is: "+price);
		e.displayEngine();
		//System.out.println("Car Engine HP is: "+e.hp);
		//System.out.println("Car Engine Strokes is: "+e.strokes);
		//System.out.println("Car Engine Type is: "+e.type);
		System.out.println("==============================");
	}

}
