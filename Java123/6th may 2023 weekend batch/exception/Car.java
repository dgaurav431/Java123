package exception;

public class Car {
	String name;
	double price;
	Car(String name, double price)
	{
		this.name=name;
		this.price=price;
	}
	public static void main(String[] args) {
		Car c1=new Car("TATA", 346457.457);
		System.out.println(c1.name);
		c1=null;
		System.out.println(c1.name);
		
	}

}
