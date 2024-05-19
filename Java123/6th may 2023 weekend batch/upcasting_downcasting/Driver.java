package upcasting_downcasting;
public class Driver {
	public static void main(String[] args) {
		Object o=new ElectricCar();
		System.out.println("================");
		Vehicle v1=new ElectricCar();
		System.out.println(v1.a);
		System.out.println(v1.b);
		System.out.println("====================");
		Car c1=new ElectricCar();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println(c1.c);
		System.out.println(c1.d);
		System.out.println("=======================");
		ElectricCar e1=new ElectricCar();
		System.out.println("downcasting================");
		Object o1=new ElectricCar();
		Car c2=(Car)o1;
		System.out.println("=================");
		ElectricCar e5=(ElectricCar)o1;
		System.out.println(e5.a);
		System.out.println(e5.b);
		System.out.println(e5.c);
		System.out.println(e5.d);
		System.out.println(e5.e);
		System.out.println(e5.f);
		
		
		
		
	}

}







