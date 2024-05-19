package split_string;

public class Program2 {
	public static void main(String[] args) {
		String s1="abc!pq!ijk!xyzp!kt";
		String[] x=s1.split("!");
		String s2="";
		for(String k:x)
		{
			s2=s2+k+" ";
			System.out.println(k);
		}
		System.out.println("===============");
		System.out.println(s2);
	}

}
