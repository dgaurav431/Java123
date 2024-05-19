package collection;
import java.util.*;
public class Program3 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(56);
		c1.add(45);
		c1.add(78);
		Collection c2=new ArrayList();
		c2.add(78);
		c2.add(65);
		c2.add(80);
		c2.addAll(c1);
		System.out.println(c2);
		
	}

}
