package multithreading;

public class DeadLOckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final String resource1="paper";
final String resource2="pen";

Thread t1=new Thread() {
	public void run() {
		synchronized (resource1) {
			System.out.println("Thread locked resource1:Paper");
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
};
Thread t2=new Thread() {
	public void run() {
		synchronized (resource2) {
			System.out.println("Thread locked resource2:Pen");
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			synchronized(resource1) {
				System.out.println("Wanted to lock resource1:Paper");
			}
		}
	}
};
	t1.start();
	t2.start();
	}

}
