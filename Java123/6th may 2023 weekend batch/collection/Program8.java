package collection;
import java.util.ArrayList;
import java.util.Collection;
public class Program8 {
	public static void main(String[] args) {
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
		System.out.println(c4.contains(38));
		System.out.println(c4.contains(78));
	}

}
