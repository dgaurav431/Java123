package string;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the String: ");
		String s1=sc.nextLine();
		if(checkPalindrome(s1))
		{
			System.out.println(s1+" is Palindrome");
		}
		else
		{
			System.out.println(s1+" is not Palindrome");
		}
	}
	public static boolean checkPalindrome(String x)
	{
		int l=x.length();
		for(int i=0;i<=l/2;i++)
		{
			if(x.charAt(i)!=x.charAt(l-1-i))
			{
				return false;
			}
		}
	return true;	
	}

}
