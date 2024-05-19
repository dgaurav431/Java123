package multithreading;

public class VehicleDriver {
	public static void main(String[] args) {
		Vehicle v1=new Vehicle("Car", 235436, "WHite");
		Vehicle v2=new Vehicle("Bike", 75436, "Black");
		Vehicle v3=new Vehicle("Bus", 1235436, "Red");
		v1.start();
		v2.start();
		v3.start();
	}

}
