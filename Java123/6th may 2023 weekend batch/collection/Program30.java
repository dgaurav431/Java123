package collection;
import java.util.*;
import java.util.List;
public class Program30 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(98);
		l1.add(67);
		l1.add(70);
		l1.add(74);
		l1.add(67);
		l1.add(87);
		ListIterator lit=l1.listIterator();
		System.out.println(lit.next());
		System.out.println(lit.previous());
	}

}
