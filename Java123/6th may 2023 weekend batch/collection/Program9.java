package collection;
import java.util.ArrayList;
import java.util.Collection;
public class Program9 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(40);
		c1.add(12);
		c1.add(50);
		Collection c2=new ArrayList();
		c2.add(40);
		c2.add(120);
		c2.add(50);
		Collection c4=new ArrayList();
		c4.add(18);
		c4.add(12);
		c4.add(16);
		c4.add(22);
		c4.add(38);
		c4.add(40);
		c4.add(48);
		c4.add(40);
		c4.add(50);
		System.out.println(c1.size());
		System.out.println(c4.size());
		System.out.println(c4.containsAll(c1));
		System.out.println(c4.containsAll(c2));
	}

}






