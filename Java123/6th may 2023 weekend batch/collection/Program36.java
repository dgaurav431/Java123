package collection;
import java.util.Stack;
public class Program36 {
	public static void main(String[] args) {
		Stack<Integer> s1=new Stack<Integer>();
		s1.push(45);
		s1.push(56);
		s1.push(78);
		s1.push(65);
		s1.push(89);
		s1.push(80);
		System.out.println(s1.search(65));
		System.out.println(s1.search(78));
		System.out.println(s1.search(80));
		System.out.println(s1.search(45));
		System.out.println(s1.search(90));
	}

}
