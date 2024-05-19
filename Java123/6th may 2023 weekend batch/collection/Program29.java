package collection;
import java.util.ArrayList;
import java.util.List;
public class Program29 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(null);
		l1.add(67);
		l1.add("mohan");
		l1.add(74);
		l1.add(67);
		l1.add(null);
		l1.add(0);
		l1.add(56);
		
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i));
		}
		
	}

}
