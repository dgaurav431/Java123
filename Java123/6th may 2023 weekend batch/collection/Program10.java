package collection;
import java.util.ArrayList;
import java.util.Collection;
public class Program10 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(40);
		c1.add(12);
		c1.add(50);
		c1.add(60);
		c1.add(40);
		Object[] x=c1.toArray();
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}

}
