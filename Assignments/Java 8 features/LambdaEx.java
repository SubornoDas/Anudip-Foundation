package java8features;

//import java.util.ArrayList;

interface runnable{
	void run();
}
public class LambdaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//ArrayList<String> list =new ArrayList<String>();
//list.add("Suborno");
//list.add("Sabdick");
//list.add("Sunita");
//list.add("Shilpa");
// for each method is available from java 8
//list.forEach( (s)-> System.out.println(s));
// without using lambda expression
Runnable r1=new Runnable() {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Thread1 is running");
	}
	

	};
	Thread t1=new Thread(r1);
	t1.start();
	// usoing lambda
	Runnable r2=()->
	{
		System.out.println("Thread2 is running");
	};
	Thread t2=new Thread(r2);
	t2.start();

}
}
