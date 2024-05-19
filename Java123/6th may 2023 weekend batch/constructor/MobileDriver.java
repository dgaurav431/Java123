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
		System.out.println("=================");
		Mobile m5=new Mobile();
		m5.seeDetails();
		Mobile m6=new Mobile("Oppo");
		m6.seeDetails();
		Mobile m7=new Mobile("VIVO", 8);
		m7.seeDetails();
		Mobile m8=new Mobile(45678, "Blue");
		m8.seeDetails();
		Mobile m9=new Mobile("NOKIA 1100", 1, 1500, "Grey");
		m9.seeDetails();
		
	}

}







