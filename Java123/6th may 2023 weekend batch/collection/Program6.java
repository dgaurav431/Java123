package collection;
import java.util.ArrayList;
import java.util.Collection;
public class Program6 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(40);
		c1.add(16);
		Collection c2=new ArrayList();
		c2.add(18);
		c2.add(12);
		Collection c3=new ArrayList();
		c3.add(40);
		c3.add(50);
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
		c4.retainAll(c3);
		System.out.println(c4);
	}

}
