package shadowing;

public class Driver {
	public static void main(String[] args) {
		Vehicle v1=new Car();
		v1.run();
		System.out.println(v1.a);
		System.out.println(v1.b);
		System.out.println("=====================");
		Car c1=new Maruti();
		c1.run();
		System.out.println(c1.a);
		System.out.println(c1.b);
		System.out.println("=========================");
		Vehicle v2=new Maruti();
		v2.run();
		System.out.println(v2.a);
		System.out.println(v2.b);
	}

}
