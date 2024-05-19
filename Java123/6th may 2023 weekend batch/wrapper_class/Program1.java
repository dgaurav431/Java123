package wrapper_class;
public class Program1 {
	public static void main(String[] args) {
		int x=325;
		Integer y=x;
		System.out.println(x+100);
		System.out.println(y+100);
		System.out.println("Hexadecimal value of "+y+" "
				+ "is: "+Integer.toHexString(x));
		//Integer y=new Integer(x);
		
		
		System.out.println(Integer.toHexString(346547));
		
	}

}
