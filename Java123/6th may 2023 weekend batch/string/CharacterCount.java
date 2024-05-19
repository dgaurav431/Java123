package string;
public class CharacterCount {
	public static void main(String[] args) {
		String s1="abaab cdab abca";
		countFrequency(s1);
	}
	public static void countFrequency(String s)
	{
		int max=0;
		char[] a=s.toCharArray();
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int count=1;
			if(a[i]!=' ') {
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
			if(count>max)
			System.out.println(a[i]+" Count is===> "+count+" times");}
		}
	}
	

}
