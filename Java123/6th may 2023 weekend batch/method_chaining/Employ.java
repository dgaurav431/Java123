package method_chaining;

public class Employ {
	String name;
	int eid;
	double salary;
	Employ()
	{
	}
	Employ(String name, int eid, double salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
	public Employ displayName()
	{
		System.out.println("Name is: "+name);
		return this;
	}
	public Employ displayEid()
	{
		System.out.println("EMploy ID is: "+eid);
		return this;
	}
	public Employ displaySalary()
	{
		System.out.println("Salary is: "+salary);
		return this;
	}

}





