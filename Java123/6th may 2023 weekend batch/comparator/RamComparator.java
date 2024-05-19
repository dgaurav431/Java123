package comparator;
import java.util.*;
public class RamComparator implements Comparator<Laptop>{
	
	public int compare(Laptop l1, Laptop l2)
	{
		if(l1.ram==l2.ram)
		{
			return l1.name.compareTo(l2.name);
		}
		return l1.ram-l2.ram;
	}

}
