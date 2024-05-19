package comparator;
import java.util.*;
public class PriceComparator implements Comparator<Laptop>{
	
	public int compare(Laptop x, Laptop y)
	{
		if(x.price==y.price)
		{
			return y.ram-x.ram;
		}
		return (int)(x.price-y.price);
	}

}
