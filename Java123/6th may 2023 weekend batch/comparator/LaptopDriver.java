package comparator;
import java.util.*;
public class LaptopDriver {
	public static void main(String[] args) {
		List<Laptop> l1=new ArrayList<Laptop>();
		l1.add(new Laptop("DELL", 8, 35467.56));
		l1.add(new Laptop("HP", 6, 38467.56));
		l1.add(new Laptop("LENOVO", 10, 29467.56));
		l1.add(new Laptop("APPLE", 8, 65467.56));
		l1.add(new Laptop("DELL", 12, 29467.56));
		l1.add(new Laptop("MICROSOFT", 10, 55467.56));
		
		System.out.println("Sorted laptop on RAM Size: ");
		Collections.sort(l1, new RamComparator());
		for(Laptop p: l1)
		{
			System.out.println(p);
		}
		System.out.println("Sorted laptop on Price: ");
		Collections.sort(l1, new PriceComparator());
		for(Laptop p:l1)
		{
			System.out.println(p);
		}
		System.out.println("Sorted laptop on name: ");
		Collections.sort(l1, new NameComparator());
		for(Laptop p:l1)
		{
			System.out.println(p);
		}
		
		
	}

}
