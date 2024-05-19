package collection;
import java.util.ArrayList;
import java.util.List;

public class Program32 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(98);
		l1.add(67);
		l1.add(70);
		l1.add(74);
		l1.add(67);
		l1.add(87);
		ArrayList a2=new ArrayList(l1);
		System.out.println(a2);
	}

}
