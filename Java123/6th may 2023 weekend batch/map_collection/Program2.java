package map_collection;
import java.util.*;
public class Program2 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm1=new LinkedHashMap<Integer, String>();
		hm1.put(12, "abc");
		hm1.put(34, "def");
		hm1.put(65, "pqe");
		hm1.put(24, "ijk");
		hm1.put(45, "xyz");
		
		System.out.println(hm1);
	}

}
