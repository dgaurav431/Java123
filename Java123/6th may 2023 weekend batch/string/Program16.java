package string;

public class Program16 {
	public static void main(String[] args) {
		String s1="John is there";
		StringBuffer sb=new StringBuffer(s1);
		
		
		System.out.println(sb.reverse());
		System.out.println(sb);
		System.out.println("=====================");
		
		StringBuffer s2=sb.reverse();
		System.out.println("The reverse of ["+s1+"] is");
		System.out.println(s2);
		
		
		
		
	}

}
