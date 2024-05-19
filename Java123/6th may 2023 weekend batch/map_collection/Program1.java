package map_collection;
import java.util.*;
public class Program1 {
	public static void main(String[] args) {
		HashMap hm1=new HashMap();
		hm1.put(12, "abc");
		hm1.put(34.6, 67);
		hm1.put(65, 20);
		hm1.put(24, 25);
		hm1.put("pqr", 23);
		hm1.put(24, 100);
		
		System.out.println(hm1);
		System.out.println(hm1.get(65));
		hm1.remove(65);
		System.out.println(hm1);
		System.out.println("Keys:  "+hm1.keySet());
		System.out.println("Values: "+hm1.values());
		
	}

}
