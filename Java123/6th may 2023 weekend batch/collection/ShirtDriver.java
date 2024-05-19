package collection;
import java.util.*;
public class ShirtDriver {
	public static void main(String[] args) {
		HashSet<Shirt> hs1=new HashSet<Shirt>();
		hs1.add(new Shirt("Arrow", 2800, 40, "White"));
		hs1.add(new Shirt("Blackberry", 3100, 42, "Red"));
		hs1.add(new Shirt("LP", 2100, 42, "Green"));
		hs1.add(new Shirt("Arrow", 4100, 38, "Green"));
		hs1.add(new Shirt("LP", 2100, 42, "Red"));
		hs1.add(new Shirt("Blackberry", 1600, 40, "Blue"));
		hs1.add(new Shirt("Arrow", 3500, 38, "Green"));
		hs1.add(new Shirt("LP", 3400, 42, "Red"));
		hs1.add(new Shirt("LP", 2300, 40, "Green"));
		hs1.add(new Shirt("Blackberry", 4300, 36, "Black"));
		hs1.add(new Shirt("Arrow", 1900, 42, "Green"));
		hs1.add(new Shirt("Arrow", 2100, 40, "Red"));
		
		System.out.println("Access all The Shirts============");
		for(Shirt x:hs1)
		{
			System.out.println(x);
		}
		System.out.println("Access All Arrow Shirts=======*********========");
		for(Shirt x:hs1)
		{
			if(x.brand_name.equals("Arrow") || x.brand_name.equals("arrow"))
			{
				System.out.println(x);
			}
		}
		System.out.println("Access All Green Shirts in 42 size=======*********========");
		for(Shirt x:hs1)
		{
			if((x.color.equals("Green") || x.color.equals("green") ) && x.size==42)
			{
				System.out.println(x);
			}
		}
		System.out.println("Access All Green Shirts in 42 size=======*********========");
		for(Shirt x:hs1)
		{
			if(x.brand_name.equals("LP") && x.size==42 && x.price<=2500)
			{
				System.out.println(x);
			}
		}
	}

}










