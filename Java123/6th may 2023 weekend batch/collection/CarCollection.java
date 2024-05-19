package collection;
import java.util.*;
public class CarCollection {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		Car c1=new Car("Maruti", 457658, "Red");
		a1.add(c1);
		a1.add(new Car("TATA", 767658, "Black"));
		a1.add(new Car("Honda", 877658, "Blue"));
		a1.add(new Car("Maruti", 907658, "White"));
		a1.add(new Car("KIA", 877658, "Blue"));
		a1.add(new Car("TATA", 767658, "Black"));
		a1.add(new Car("Maruti", 677658, "White"));
		System.out.println("All the cars=================");
		for(Object x:a1)
		{
			System.out.println(x);
		}
		System.out.println("Access all maruti car==============");
		for(Object x:a1)
		{
			if(((Car)x).name.equals("Maruti"))
			{
				System.out.println(x);
			}
		}
		System.out.println("Access all maruti car of price less than 7lacs ==============");
		for(Object x:a1)
		{
			if(((Car)x).name.equals("Maruti") && ((Car)x).price<=700000)
			{
				System.out.println(x);
			}
		}
	}

}












