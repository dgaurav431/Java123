package static_keyword;

public class Program1 {
	static
	{
		System.out.println("This is static block-1");
		int n=6;
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		} 
		System.out.println(n+"!= "+fact);
	}
	
	public static void main(String[] args) {
		System.out.println("This is main method");
	}
	
	static
	{
		System.out.println("This is static block-2");
	}

}
