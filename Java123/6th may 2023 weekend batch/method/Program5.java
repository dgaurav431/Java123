class Program5
{
	
	public static void main(String[] args)
	{
		System.out.println("This is program5");
		Program4.sum();//static method is called on class reference
		
		Program4 p=new Program4();
		p.multiply();//non-static method is called on object reference
	}
	
}