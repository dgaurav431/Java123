package split_string;
public class Program3 {
	public static void main(String[] args) {
		String s1="abc!pr@erty#dgw!rt";
		String[] x=s1.split("[#@!]");
		for(String k:x)
		{
			System.out.println(k);
		}
	}

}
