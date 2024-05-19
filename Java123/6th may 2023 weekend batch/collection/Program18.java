package collection;
import java.util.*;
import java.util.Collection;

public class Program18 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(34);
		c1.add(67);
		c1.add(89);
		c1.add(74);
		c1.add(67);
		c1.add(88);
		Iterator itr=c1.iterator();
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		System.out.println(itr.hasNext());
		
	}

}
