package string;

public class Program5 {
	public static void main(String[] args) {
		String s1=new String("Mohan").intern();
		String s2="Mohan";
		System.out.println(s1==s2);
		System.out.println("=======================");
		String x=new String("pqr");
		x.intern();
		String y="pqr";
		System.out.println(x==y);
	}

}
