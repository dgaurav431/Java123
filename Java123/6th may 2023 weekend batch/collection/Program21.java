package collection;
//remove all integer values from collection
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Program21 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(34);
		c1.add(67);
		c1.add("mohan");
		c1.add(74);
		c1.add(67.8);
		c1.add(88);
		c1.add(65);
		c1.add('d');
		Iterator itr=c1.iterator();
		while(itr.hasNext())
		{
			if(itr.next() instanceof Integer)
			{
				itr.remove();
			}
		}
		System.out.println(c1);
	}

}
