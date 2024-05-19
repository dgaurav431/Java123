package multithreading;

public class RocketDriver {
	public static void main(String[] args) {
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		System.out.println("Thread Priority is: "+Thread.currentThread().getPriority());
		Rocket r1=new Rocket();
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Rocket r2=new Rocket();
		Rocket r3=new Rocket();
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		t2.setDaemon(true);
		t1.setPriority(10);
		t2.setPriority(1);
		t1.setName("Agni");
		t2.setName("Vayu");
		t3.setName("Toofan");
		t1.start();
		t2.start();
		t3.start();
		
	}

}
