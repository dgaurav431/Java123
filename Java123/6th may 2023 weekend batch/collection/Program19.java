package collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Program19 {
public static void main(String[] args) {
	Collection c1=new ArrayList();
	c1.add(34);
	c1.add(67);
	c1.add(89);
	c1.add(74);
	c1.add(67);
	c1.add(88);
	Iterator itr=c1.iterator();
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());
	
}

}
