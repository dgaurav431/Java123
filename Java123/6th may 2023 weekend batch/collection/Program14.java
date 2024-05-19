package collection;
import java.util.ArrayList;
import java.util.Collection;
public class Program14 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(40);
		c1.add(12);
		c1.add(56.7);
		c1.add(50);
		c1.add(60.8);
		c1.add("mohan");
		c1.add(40);
		Object[] x=c1.toArray();
		for(int i=0;i<x.length;i++)
		{
			if(!(x[i] instanceof Integer))
			{
				c1.remove(x[i]);
			}
		
		}
		System.out.println(c1);
		
	}
}
