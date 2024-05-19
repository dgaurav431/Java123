package string;
import java.util.*;
public class AnagramString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the 1st String: ");
		String s1=sc.nextLine();
		System.out.println("ENter the 2nd String: ");
		String s2=sc.nextLine();
		if(checkAnagram(s1, s2))
		{
			System.out.println(s1+"   and "+s2 +" are anagram");
		}
		else
		{
			System.out.println(s1+"   and "+s2 +" are not anagram");
		}
		
		
	}
	public static boolean checkAnagram(String s1, String s2)
	{
		int[] count1=countCharacter(s1);
		int[] count2=countCharacter(s2);
		for(int i=0;i<count1.length;i++)
		{
			if(count1[i]!=count2[i])
			{
				return false;
			}
		}
	return true;	
	}
	public static int[] countCharacter(String s)
	{
		int[] count=new int[26];
		for(int i=0; i<s.length();i++)
		{
			char x=s.charAt(i);
			if(x>='A' && x<='Z')
			{
				count[x-65]++;
			}
			if(x>='a' && x<='z')
			{
				count[x-97]++;
			}
		}
	return count;
	}

}








