package string;

public class Program8 {
	public static void main(String[] args) {
		String s1="He, yo%4u and I i@s here. It is g!ood.";
		s1=s1.toLowerCase();
		int count=0;
		System.out.println(s1.length());
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>=97 &&s1.charAt(i)<=122)
			{
				count++;
			}
		}
		System.out.println("total alphabets are: "+count);
	}

}
