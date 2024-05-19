package collection;
import java.util.*;
public class Program38 {
	public static void main(String[] args) {
		int[] a= {12, 16, 34, 12, 45, 34, 12, 20, 34, 12, 20};
		HashSet hs1=new HashSet();
		
		for(int i=0;i<a.length;i++)
		{
			hs1.add(a[i]);
		}
		System.out.println(hs1);
	}

}
