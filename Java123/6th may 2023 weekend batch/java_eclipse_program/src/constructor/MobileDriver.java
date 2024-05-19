package constructor;
public class MobileDriver {
	public static void main(String[] args) {
		Mobile m1=new Mobile("Samsung", 12, 46547.56);
		Mobile m2=new Mobile("SONY", 8, 41547.56);
		Mobile m3=new Mobile("NOKIA", 9, 47547.56);
		Mobile m4=new Mobile("IPHONE", 6, 96547.56);
		m1.seeDetails();
		m2.seeDetails();
		m3.seeDetails();
		m4.seeDetails();
		
	}

}
