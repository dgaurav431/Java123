package multithreading;

public class Rocket implements Runnable{
	
	
	public void run()
	{
		System.out.println("Thread name is: "+Thread.currentThread().getName());
		System.out.println("thread execution is started");
		System.out.println("Thread ID is: "+Thread.currentThread().getId());
		System.out.println("Thread Priority is: "+Thread.currentThread().getPriority());
	}
	
	

}
