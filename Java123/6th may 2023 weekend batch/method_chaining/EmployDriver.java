package method_chaining;

public class EmployDriver {
	public static void main(String[] args) {
		Employ e1=new Employ("Mohan", 210, 345678.2);
		Employ e2=new Employ("Sohan", 215, 445678.2);
		Employ e3=new Employ("Rohan", 212, 245678.2);
		Employ e4=new Employ("John", 218, 375678.2);
		Employ e5=new Employ("Jack", 217, 315678.2);
		e1.displayName().displaySalary();
		
		System.out.println("==========================");
		e2.displayName().displayEid().displaySalary();
		System.out.println("========================");
		
		e3.displayEid().displaySalary();
	}

}
