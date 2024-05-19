package method_overriding;
public class Circle extends Shape{
	double radius;
	Circle()
	{
	}
	Circle(double radius)
	{
		this.radius=radius;
	}
	@Override
	public void findArea()
	{
		System.out.println("Area of Circle is: "+3.14*radius*radius);
	}
	@Override
	public void findPerimeter()
	{
		System.out.println("Perimeter of Circle is: "+2*3.14*radius);
	}
	
	

}
