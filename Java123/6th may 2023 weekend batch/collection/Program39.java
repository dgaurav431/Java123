package collection;
import java.util.*;
public class Program39 {
	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(56);
		a1.add(45);
		a1.add(56);
		a1.add(78);
		a1.add(56);
		a1.add(45);
		a1.add(78);
		a1.add(20);
		a1.add(56);
		a1.add(45);
		System.out.println(a1);
		HashSet hs1=new HashSet(a1);
		System.out.println(hs1);
		
	}

}
