package collection;
import java.util.*;
public class Program25 {
	public static void main(String[] args) {
		List c1=new ArrayList();
		c1.add(34);
		c1.add(67);
		c1.add("mohan");
		c1.add(74);
		c1.add(67.8);
		c1.add(88);
		c1.add(67);
		c1.add(65);
		System.out.println(c1);
		c1.add(1, 20);
		System.out.println(c1);
		c1.add(2, 90);
		System.out.println(c1);
		
	}

}
