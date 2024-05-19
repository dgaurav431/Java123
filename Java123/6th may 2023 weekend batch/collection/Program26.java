package collection;
import java.util.ArrayList;
import java.util.List;
public class Program26 {
	public static void main(String[] args) {
		List c1=new ArrayList();
		c1.add(34);
		c1.add(67);
		c1.add("mohan");
		c1.add(74);
		
		List l2=new ArrayList();
		l2.add(60);
		l2.add(89);
		l2.add("john");
		l2.add(50);
		l2.addAll(1, c1);
		l2.add(90);
		System.out.println(l2);
	}

}
