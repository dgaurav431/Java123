package collection;

import java.util.*;
public class Program24 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(34);
		c1.add(67);
		c1.add("mohan");
		c1.add(74);
		c1.add(67.8);
		c1.add(88);
		c1.add(67);
		c1.add(65);
		System.out.println(c1);
		c1.add(20);
		System.out.println(c1);
		c1.remove(67);
		System.out.println(c1);
		
	}

}
