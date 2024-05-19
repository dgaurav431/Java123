package encapsulation;

public class EmployDriver {
	public static void main(String[] args) {
		Employ e1=new Employ("Mohan", 356, 34564.56);
		System.out.println("Name is: "+e1.getName());
		e1.setName("jack");
		System.out.println("======================");
		System.out.println("Name is: "+e1.getName());
		
	}

}
