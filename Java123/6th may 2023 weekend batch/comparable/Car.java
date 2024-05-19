package comparable;
public class Car implements Comparable<Car>{
	String name;
	int carno;
	double price;
	Car()
	{
	}
	Car(String name, int carno, double price)
	{
		this.name=name;
		this.carno=carno;
		this.price=price;
	}
	public String toString()
	{
		return "Name: "+name+" Car No: "+carno+" Price: "+price;
	}
	
	/*public int compareTo(Car c)
	{
		return this.carno-c.carno;
	}*/
	/*public int compareTo(Car c)
	{
		return (int)(this.price-c.price);
	}*/
	public int compareTo(Car c)
	{
		return this.name.compareTo(c.name);
	}
	
}









