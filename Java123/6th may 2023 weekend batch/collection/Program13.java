package collection;
import java.util.ArrayList;
import java.util.Collection;
public class Program13 {
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
		int sum=0;
		//access only integer elements
		for(int i=0;i<x.length;i++)
		{
			if(x[i] instanceof Integer)
			{
				System.out.println(x[i]);
				sum=sum+(Integer)x[i];
			}
		}
		System.out.println("the sum is: "+sum);
	}

}
