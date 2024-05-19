class EmployDriver
{
	public static void main(String[] args)
	{
		Employ e1=new Employ();
		e1.setValue("Mohan", 201, 34546.45);
		Employ e2=new Employ();
		e2.setValue("Sohan", 301, 31546.45);
		Employ e3=new Employ();
		e3.setValue("ChandraMohan", 501, 71546.45);
		Employ e4=new Employ();
		e4.setValue("PyareMohan", 701, 44546.45);
		e1.displayDetails();
		e2.displayDetails();
		e3.displayDetails();
		e4.displayDetails();
		System.out.println("Salary of Employ1 for this month is :"+e1.getSalary());
		
		
	}
}