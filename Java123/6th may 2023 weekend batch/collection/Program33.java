package collection;
import java.util.ArrayList;
import java.util.List;
public class Program33 {
	public static void main(String[] args) {
			List<Integer> l1=new ArrayList<Integer>();
			l1.add(98);
			l1.add(67);
			l1.add(70);
			l1.add(74);
			l1.add(67);
			l1.add(87);
			int sum=0;
			for(Integer x:l1)
			{
				sum=sum+x;
			}
			System.out.println("The sum is: "+sum);
	}

}
