package collection;
import java.util.*;
public class Program5 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(10);
		c1.add(16);
		c1.add(18);
		Collection c2=new ArrayList();
		c2.add(18);
		c2.add(12);
		c2.add(16);
		c2.add(15);
		c2.add(12);
		c2.add(18);
		c2.add(15);
		c2.add(20);
		c2.removeAll(c1);
		System.out.println(c2);
		
	}

}
