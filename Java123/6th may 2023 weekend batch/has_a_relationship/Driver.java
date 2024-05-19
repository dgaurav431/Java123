package has_a_relationship;

public class Driver {
	public static void main(String[] args) {
		Car c1=new Car("Honda", 4565765.56);
		System.out.println("Car Obj address is: "+c1);
		System.out.println("Car Engine obj address is: "+c1.e);
		System.out.println("Car Name is: "+c1.name);
		System.out.println("Car Price is: "+c1.price);
		System.out.println("Car Engine HP is: "+c1.e.hp);
		System.out.println("Car Engine Strokes is: "+c1.e.strokes);
		System.out.println("Car ENgine Type is: "+c1.e.type);
		c1.e.start();
		System.out.println("=====================");
		Car c2=new Car("Maruti", 346546.56);
		c2.displayCar();
		Car c3=new Car("Audi", 354367.56, new Engine(100, 10, "Petrol"));
		c3.displayCar();
		Car c4=new Car("BMW", 45757568.67);
		c4.displayCar();
	}

}
