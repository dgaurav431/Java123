package string;

public class Program2 {
	public static void main(String[] args) {
		String s1="Mohan";
		String s2=new String("Mohan");
		String s3="Mohan";
		String s4=new String("John");
		String s5="John";
		String s6="Mohan";
		String s7=new String("Sohan");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s4==s5);
		System.out.println(s4.equals(s5));
		System.out.println(s6==s2);
		System.out.println(s7==s4);
		
	}

}
