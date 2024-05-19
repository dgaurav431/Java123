package wrapper_class;

import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		double x=sc.nextDouble();
		String p=Double.toString(x);
		int count=0;
		for(int i=0;i<p.length();i++)
		{
			char c=p.charAt(i);
			//if(c!='.' && i!=p.length()-1 ||i==p.length()-1 && c!='0')
			if(c!='.')
			{
				count++;
			}
		}
		System.out.println("Total digit is: "+count);
	}

}
