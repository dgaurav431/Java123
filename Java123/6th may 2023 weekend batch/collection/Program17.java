package collection;
import java.util.ArrayList;
import java.util.Collection;
//access only the numbers which is odd number
public class Program17 {
	public static void main(String[] args) {
		Collection c1=new ArrayList();
		c1.add(34);
		c1.add(67);
		c1.add(89);
		c1.add(74);
		c1.add(67);
		c1.add(88);
		for(Object x:c1)
		{ 
			if(((Integer)x)%2!=0)
			System.out.println(x);
		}
	}

}
