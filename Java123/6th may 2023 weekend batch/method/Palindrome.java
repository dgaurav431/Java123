//print palindrome from 500 upto 1500
class Palindrome
{
	static int count=0;
	static int sum=0;
	public static void main(String[] args)
	{
		System.out.println("The palindrome numbers are Below..");
		for(int i=500;i<=1500;i++)
		{
			printPalindrome(i);
		}
		System.out.println("Total Palindrome number in the range is: "+count); 
		System.out.println("Total sum of Palindrome numbers in the range is: "+sum); 
	}
	public static void printPalindrome(int n)
	{
		
		int rev=0;
		int a=n;
		while(n>0)
		{
			int rem=n%10;
			rev=10*rev+rem;
			n=n/10;
		}
		if(rev==a)
		{
			System.out.print(a+"    ");
			count++;
			sum=sum+a;
		}
	}
	
}









