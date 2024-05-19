package encapsulation;

import java.util.Scanner;

public  class Employ {
	private int pwd=3452;
	private String name;
	private int eid;
	private double salary;
	Employ()
	{
	}
	Employ(String name, int eid, double salary)
	{
		this.name=name;
		this.eid=eid;
		this.salary=salary;
	}
	public String getName()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the password: ");
		int x=sc.nextInt();
		if(pwd==x)
		{
			System.out.println("Validation to get Name is successfull");
			return name;
		}
		else
		{
			System.out.println("Validation to get Name is Invalid!!");
			return null;
		}
		
	}
	public int getEid()
	{
		//validation
		return eid;
	}
	public double getSalary()
	{
		//validation
		return salary;
	}
	public void setName(String name)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the password: ");
		int x=sc.nextInt();
		if(pwd==x)
		{
			System.out.println("Validation to set Name is successfull");
			this.name=name;
		}
		else
		{
			System.out.println("Validation to set Name is Invalid!! NAme will not set!!");
		}
	}
	public void setEid(int eid)
	{
		//validation
		this.eid=eid;
	}
	public void setSalary(double salary)
	{
		//validation
		this.salary=salary;
	}

}














