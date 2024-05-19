package string;

public class Program10 {
	public static void main(String[] args) {
		String s1="asdsa fdg43!@#.";
		System.out.println(s1.codePointAt(2));
		System.out.println("====================");
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.codePointAt(i));
		}
		
	}

}
