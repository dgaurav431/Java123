
class Program3
{

	public static void main(String[] args)
	{
		int a=18;
		int b=++a;
		b--;
		int c= a++ + --b;
		int d= b++ - --a;

		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		

	}


}