import java.util.Scanner;
class Employ
{
	String name;
	int id;
	double salary;

	public void setValue(String n, int i, double s)
	{	
		name=n;
		id=i;
		salary=s;
	}
	
	public void displayDetails()
	{
		System.out.println("Name is: "+name);
		System.out.println("ID is: "+id);
		System.out.println("Salary is: "+salary);
		System.out.println("======================");
	}
	public double getSalary() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the Number of days of leave");
		int x=sc.nextInt();
	return (salary*(30-x))/30;
	}
}














