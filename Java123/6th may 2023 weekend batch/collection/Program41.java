package collection;
import java.util.*;
public class Program41 {
	public static void main(String[] args) {
		String s1="treqastreaatbabs";
		HashSet<Character> hs1=new HashSet<Character>();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(hs1.add(s1.charAt(i)))
			{
				count++;
			}
		}
		System.out.println(hs1);
		System.out.println("Total unique characters are: "+count);
		
	}

}
