package singleton_class;

public class Car {
	private static Car c1=null;
	String name;
	int price;
	String color;
	private Car(String name, int price, String color)
	{
		this.name=name;
		this.price=price;
		this.color=color;
	}
	public static Car getInstance()
	{
		if(c1==null) {
		c1=new Car("TATA", 234445, "White");
		return c1;
		}
	return c1;
	}

}




