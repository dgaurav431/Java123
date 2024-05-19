package comparable;
import java.util.*;
public class Program2 {
	public static void main(String[] args) {
		List l1=new ArrayList();
		l1.add(34);
		l1.add(56);
		l1.add(67);
		l1.add(90);
		l1.add(46);
		l1.add(72);
		
		Collections.sort(l1);
		
		System.out.println(l1);
		
	}

}
