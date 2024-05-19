package pattern;
import java.util.Scanner;
public class Pyramid2 {
	public static void main(String[] args) {Scanner sc=new Scanner(System.in);System.out.println("ENter n");int n=sc.nextInt();
	printPattern(n);}
public static void printPattern(int n){
	int p=1;int q=n;
	for(int i=1;i<=n;i++){
		for(int j=1;j<q;j++)
		{
				System.out.print("  ");
		}
		for(int j=1;j<=p;j++)
		{
			System.out.print("* ");
		}
		p+=2;
		q--;
		System.out.println();
	}
}

}
