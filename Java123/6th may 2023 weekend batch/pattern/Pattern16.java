package pattern;

import java.util.Scanner;
public class Pattern16 {
	public static void main(String[] args) {Scanner sc=new Scanner(System.in);System.out.println("ENter n");int n=sc.nextInt();
	printPattern(n);}
public static void printPattern(int n){
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++)
		{
			if(i==n||j==n||i==j)
			{
				System.out.print("*  ");
			}
			else
			{
				System.out.print("   ");
			}
		}
		System.out.println();
	}
}

}
