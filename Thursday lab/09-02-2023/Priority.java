package newassignment;

public class Priority extends Thread {
	public Priority(String name)
	{
		super(name);
	}
	public void run() {
		System.out.println("Thread is running !! " + Priority.currentThread().getName()+"Priority : "+Thread.currentThread().getPriority());
	}
	

	public static void main(String[] args) {
		
		Priority p1=new Priority("First-thread");		
		Priority p2=new Priority("Second-thread");	
		Priority p3=new Priority("Third-thread");		
		
		p1.start();	
		p2.start();
		p3.start();
		
	}

}
