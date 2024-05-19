package string;

public class Program14 {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("Today is sunday and");
		System.out.println("====================");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
	}

}
