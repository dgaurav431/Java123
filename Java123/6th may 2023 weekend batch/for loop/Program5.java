//WAJP to print LCM
import java.util.Scanner;
class Program5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd Number: ");
		int c=sc.nextInt();
		int x=a>b?a:b;
		int big=x>c?x:c;
		int count=0;
		for(int i=big;;i=i+big)
		{
			count++;
			System.out.println("Loop Number :"+count);
			if(i%a==0 && i%b==0 && i%c==0)
			{
				System.out.println("LCM is: "+i);
				break;
			}
		}
		

	}


}