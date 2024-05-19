package comparator;
import java.util.*;
public class NameComparator implements Comparator<Laptop>{
	
	public int compare(Laptop x, Laptop y)
	{
		return x.name.compareTo(y.name);
	}

}
