package string;

public class SumOfNumericDigit {
	public static void main(String[] args) {
		String s1="a4b3 d7385e";
		System.out.println("The sum is: "+findSumOfNumericCharacter(s1));
		
		//System.out.println('2'-48+10);
		//System.out.println('4'-48+10);
		//System.out.println('5'-48+10);
	}
	public static int findSumOfNumericCharacter(String s)
	{
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char x=s.charAt(i);
			if(x>=48 && x<=57)
			{
				sum=sum+(x-48);
			}
		}
		return sum;
	}

}








