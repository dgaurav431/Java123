package string;

public class WordCount {
	public static void main(String[] args) {
		String s1="a     Mohan is coming today with his friends     b";
		int count=0;
		for(int i=0;i<s1.length()-1;i++)
		{
			if(s1.charAt(0)!=' '&& i==0 ||s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
			{
				count++;
			}
			
		}
		System.out.println("Total number of word is: "+count);
	}

}
