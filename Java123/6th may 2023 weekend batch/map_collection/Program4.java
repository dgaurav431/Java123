package map_collection;
import java.util.LinkedHashMap;
public class Program4 {
public static void main(String[] args) {
	LinkedHashMap<Integer, String> hm1=new LinkedHashMap<Integer, String>();
	hm1.put(12, "abc");
	hm1.put(34, "def");
	hm1.put(65, "pqe");
	hm1.put(24, "ijk");
	hm1.put(32, "ijk");
	hm1.put(46, "ijk");
	hm1.put(45, "xyz");
	System.out.println(hm1.keySet());
	System.out.println("========All Keys========");
	for(Integer p:hm1.keySet())
	{
		System.out.println(p);
	}
	System.out.println("========All Keys which are bigger then 30========");
	for(Integer p:hm1.keySet())
	{
		if(p>30)
		System.out.println(p);
	}
	System.out.println("========All Values========");
	for(String p:hm1.values())
	{
		System.out.println(p);
	}
	
	
}

}



