package collection;
import java.util.*;
public class Program4 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(56);
		c1.add(45);
		c1.add(78);
		c1.add(43);
		c1.add(67);
		c1.add(45);
		System.out.println(c1.remove(45));
		System.out.println(c1);
		System.out.println(c1.remove(90));
		System.out.println(c1);
	}

}
