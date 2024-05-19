package immutable_class;

public class Driver {
	public static void main(String[] args) {
		A a1=new A();
		System.out.println(a1.x);
		System.out.println("===========");
		A a2=a1;
		a2.x=48;
		System.out.println(a1.x);
		System.out.println(a2.x);
	}

}
