package pattern;

import java.util.Scanner;

public class Triangle2 {
	public static void main(String[] args) {Scanner sc=new Scanner(System.in);System.out.println("ENter n");int n=sc.nextInt();
	printPattern(n);}
public static void printPattern(int n){
	for(int i=1;i<=n;i++){
		for(int j=1;j<=n;j++)
		{
			if(j>=i)
				System.out.print("*  ");
			else
				System.out.print("   ");
		}
		System.out.println();
	}
}

}
