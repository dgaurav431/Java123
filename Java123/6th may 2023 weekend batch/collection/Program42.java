package collection;
import java.util.HashSet;
public class Program42 {
	public static void main(String[] args) {
		String s1="treqastreaatbabs";
		String s2="";
		HashSet<Character> hs1=new HashSet<Character>();
		for(int i=0;i<s1.length();i++)
		{
			if(hs1.add(s1.charAt(i)))
			{
				s2=s2+s1.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
