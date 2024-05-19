package method_overriding;

public class Driver {
	public static void main(String[] args) {
		Shape s1=new Rectangle(12, 10);
		s1.findArea();
		s1.findPerimeter();
		System.out.println("======================");
		Shape s2=new Circle(10);
		s2.findArea();
		s2.findPerimeter();
	}

}
