package string;

public class Program9 {
	
		public static void main(String[] args) {
			String s1="He, you and I is here. It is good.";
		
			int count=0;
			System.out.println(s1.length());
			for(int i=0;i<s1.length();i++)
			{
				if(s1.charAt(i)==' ' || s1.charAt(i)==','|| s1.charAt(i)=='.')
				{
					continue;
				}
				count++;
			}
			System.out.println("total alphabets are: "+count);
		}

}
