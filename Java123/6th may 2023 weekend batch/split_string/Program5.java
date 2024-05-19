package split_string;
public class Program5 {
	public static void main(String[] args) {
		String s1="mohan and sohan are here";
		System.out.print(revString(s1));
	}
	public static String revString(String x)
	{
		String[] k=x.split(" ");
		String p="";
		for(int i=0;i<k.length;i++)
		{
			p=p+revWord(k[i])+" ";
		}
	return p;
	}
	public static String revWord(String s1)
	{
		String rev="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			rev=rev+s1.charAt(i);
		}
	return rev;
	}

}










