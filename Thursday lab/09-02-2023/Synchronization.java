package newassignment;
class Print{
synchronized void multiplication(int n) {
		for(int i=1;i<=5;i++) {
			System.out.println(n+" * "+i+" = "+n*i);
			try {
				Thread.sleep(400);
				
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
}
}
 class Thread1 extends Thread{
	 Print t;
	 public Thread1(Print t) {
		 this.t=t;
	 }
	 public void run() {
		 t.multiplication(5);
	 }
 }
 class Thread2 extends Thread{
	 Print t;
	 public Thread2(Print t) {
		 this.t=t;
	 }
	 public void run() {
		 t.multiplication(10);
	 }
 }
 
public class Synchronization {
public static void main(String[] args) {
Print pd =new Print();

Thread1 t1=new Thread1(pd);
Thread2 t2=new Thread2(pd);

t1.start();
t2.start();

}
}

