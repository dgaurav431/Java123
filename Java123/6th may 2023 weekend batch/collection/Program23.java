package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//print all even numbers
public class Program23 {
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
			Object p=itr.next();
			if( p instanceof Integer && ((Integer)p)%2==0)
			{
				System.out.println(p);
			}
		}
	}

}
