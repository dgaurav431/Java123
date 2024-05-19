package comparable;

import java.util.Arrays;

public class Program1 {
	public static void main(String[] args) {
		int[] a= {16, 23, 18, 45, 19, 35, 50, 21};
		
		Arrays.sort(a);
		
		for(int x: a)
		{
			System.out.println(x);
		}
	}

}
