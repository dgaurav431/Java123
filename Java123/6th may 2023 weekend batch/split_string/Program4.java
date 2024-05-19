package split_string;

public class Program4 {
	public static void main(String[] args) {
		String s1="mohan and sohan are here";
		System.out.print(rev(s1));
	}
	public static String rev(String x)
	{
		String[] k=x.split(" ");
		String p="";
		for(int i=k.length-1;i>=0;i--)
		{
			p=p+k[i]+" ";
		}
	return p;
	}

}
