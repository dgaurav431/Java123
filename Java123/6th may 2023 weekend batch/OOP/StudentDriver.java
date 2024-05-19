class StudentDriver
{
	public static void main(String[] args)
	{
		Student s1=new Student();
		System.out.println("Student1 details before any change======");
		System.out.println("Student1 Object address :"+s1);
		System.out.println("Student1 School name is :"+s1.school_name);
		System.out.println("Student1 Name is :"+s1.name);
		System.out.println("Student1 roll number :"+s1.rollno);
		s1.read();
		//System.out.println("Student1 details is being changed now======");
		s1.school_name="Bapuji School";
		s1.name="Mohan";
		s1.rollno=231;
		Student s2=new Student(); 
		//System.out.println("Student2 details is being changed now======");
		s2.name="Sohan";
		s2.rollno=431;
		Student s3=new Student(); 
		//System.out.println("Student3 details is being changed now======");
		s3.name="JagMohan";
		s3.rollno=420;
		s3.school_name="Bose School";
		Student s4=new Student(); 
		//System.out.println("Student4 details is being changed now======");
		s4.name="PyareMohan";
		s4.rollno=425;
		s2.name="Jethalal";
		System.out.println("Student1 details after change======");
		System.out.println("Student1 School name is :"+s1.school_name);
		System.out.println("Student1 Name is :"+s1.name);
		System.out.println("Student1 roll number :"+s1.rollno);
		s1.read();
		System.out.println("Student2 details after change======");
		System.out.println("Student2 School name is :"+s2.school_name);
		System.out.println("Student2 Name is :"+s2.name);
		System.out.println("Student2 roll number :"+s2.rollno);
		s2.read();
		System.out.println("Student3 details after change======");
		System.out.println("Student3 School name is :"+s3.school_name);
		System.out.println("Student3 Name is :"+s3.name);
		System.out.println("Student3 roll number :"+s3.rollno);
		s3.read();
		System.out.println("Student4 details after change======");
		System.out.println("Student4 School name is :"+s4.school_name);
		System.out.println("Student4 Name is :"+s4.name);
		System.out.println("Student4 roll number :"+s4.rollno);
		s4.read();
		

	}
}










