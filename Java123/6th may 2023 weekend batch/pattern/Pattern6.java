package pattern;

import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);System.out.println("ENter n");int n=sc.nextInt();
		printPattern(n);
	}
	public static void printPattern(int n){
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++)
			{
				if(i==4|| i==2)
				{
					//System.out.print(i+"  ");
					System.out.print(j+"  ");
				}
				else
				{
					System.out.print("*  ");
				}
			}
			System.out.println();
		}
	}

}