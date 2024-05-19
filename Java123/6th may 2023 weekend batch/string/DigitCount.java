package string;
import java.util.Scanner;
public class DigitCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number: ");
		double x=sc.nextDouble();
		String y=String.valueOf(x);
		int count=0;
		for(int i=0;i<y.length();i++)
		{
			if(y.charAt(i)!='.')
			{
				count++;
			}
		}
		System.out.println("Total digit in "+x+" is: "+count);
		
	}

}
