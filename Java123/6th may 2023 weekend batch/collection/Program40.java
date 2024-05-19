package collection;
import java.util.HashSet;
public class Program40 {
	public static void main(String[] args) {
		int[] a= {12, 16, 34, 12, 45, 34, 12, 20, 34, 12, 20};
		HashSet hs1=new HashSet();
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(hs1.add(a[i]))
			{
				count++;
				sum=sum+a[i];
			}
			
		}
		System.out.println(hs1);
		System.out.println("Total unique elements are: "+hs1.size());
		System.out.println("Unique elements are: "+count);
		System.out.println("Sum of unique elements are: "+sum);
	}

}
