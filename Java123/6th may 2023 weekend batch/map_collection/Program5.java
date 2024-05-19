package map_collection;
import java.util.*;
public class Program5 {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm1=new LinkedHashMap<Integer, String>();
		hm1.put(12, "abc");
		hm1.put(34, "def");
		hm1.put(65, "pqe");
		hm1.put(24, "ijk");
		hm1.put(32, "ijk");
		hm1.put(46, "ijk");
		hm1.put(45, "xyz");
		System.out.println("Access All The Entries: ");
		for(Map.Entry<Integer, String>  p: hm1.entrySet())
		{
			System.out.println(p.getKey()+" : "+p.getValue());
		}
		System.out.println("Access All The Entries where key is greatre than 30: ");
		for(Map.Entry<Integer, String>  p: hm1.entrySet())
		{
			if(p.getKey()>30)
			System.out.println(p.getKey()+" : "+p.getValue());
		}
		
	}

}





