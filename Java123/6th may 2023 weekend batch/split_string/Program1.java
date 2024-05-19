package split_string;

public class Program1 {
	public static void main(String[] args) {
		String s1="mohan and sohan are here";
		String[] x=s1.split(" ");
		System.out.println("Total word count is: "+x.length);
		System.out.println("===========for==============");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("=========for each================");
		for(String k:x)
		{
			System.out.println(k);
		}
	}

}
