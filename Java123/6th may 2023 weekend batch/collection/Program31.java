package collection;
import java.util.ArrayList;
import java.util.List;  
import java.util.ListIterator;
public class Program31 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(98);
		l1.add(67);
		l1.add(70);
		l1.add(74);
		l1.add(67);
		l1.add(87);
		ListIterator lit=l1.listIterator();
		while(lit.hasNext())
		{
			System.out.println(lit.next());
		}
		System.out.println("============================");
		while(lit.hasPrevious())
		{
			System.out.println(lit.previous());
		}
	}

}
