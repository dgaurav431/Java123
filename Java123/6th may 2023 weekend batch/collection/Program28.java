package collection;

import java.util.ArrayList;
import java.util.List;

public class Program28 {
	public static void main(String[] args) {
		List c1=new ArrayList();
		c1.add(34);
		c1.add(67);
		c1.add("mohan");
		c1.add(74);
		c1.add(67);
		c1.add(70);
		c1.add(0);
		System.out.println(c1.get(4));
		System.out.println(c1.get(12));
	}

}
