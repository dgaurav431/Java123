package comparable;
import java.util.*;

public class CarDriver {
	public static void main(String[] args) {
		Car c1=new Car("maruti", 341, 233255.45);
		List<Car> l1=new ArrayList<Car>();
		l1.add(c1);
		l1.add(new Car("tata", 348, 263255.45));
		l1.add(new Car("kia", 310, 283255.45));
		l1.add(new Car("audi", 421, 823255.45));
		l1.add(new Car("honda", 732, 712255.45));
		System.out.println("Access all Cars===============");
		for(Car x: l1)
		{
			System.out.println(x);
		}
		System.out.println("Sorted car on car number============");
		Collections.sort(l1);
		for(Car x:l1)
		{
			System.out.println(x);
		}

		
	}

	

}
