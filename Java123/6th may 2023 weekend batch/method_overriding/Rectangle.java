package method_overriding;
public class Rectangle extends Shape{
	double l;
	double w;
	Rectangle()
	{
		
	}
	Rectangle(double l, double w)
	{
		this.l=l;
		this.w=w;
	}
	@Override
	public void findArea()
	{
		System.out.println("Area of Rectangle is: "+l*w);
	}
	@Override
	public void findPerimeter()
	{
		System.out.println("Perimeter of Rectangle is: "+2*(l+w));
	}

}
