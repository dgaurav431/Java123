package string;

public class ArrayCount {
	public static void main(String[] args) {
		int[] x= {12, 16, 34, 12, 18, 34, 12, 40, 12, 16, 12, 50, 42};
		countFrequency(x);
	}
	public static void countFrequency(int[] a)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=a[n-1];
					n--;
					j--;
				}
			}
			System.out.println(a[i]+" Count is===> "+count+" times");
		}
	}

}







