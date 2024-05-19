package constructor;

public class FruitDriver {
	public static void main(String[] args) {
		Fruit f1=new Fruit("Mango", 120, "Yellow");
		f1.displayDetails();
		Fruit f2=new Fruit(f1);
		f2.displayDetails();
		
		
	}

}
