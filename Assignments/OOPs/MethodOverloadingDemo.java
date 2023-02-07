package OOPs;
class Addition{
	public  void add(int a) {
		//if we dont give brackets then + sign will be taken as concatenation
		//this is why we use bracketsto add
		System.out.println("Addition of one parameter:"+(a));
		
	}
public void add(int a,int b,int c) {
	System.out.println("Addition of the parameters:"+(a+b+c));	
}
public void add(double a,double b) {
	System.out.println("Addition of the parameter(double,double):"+(a+b));
}
public void add(int a,double b) {
	System.out.println("Addition of the parameters:"+(a+b));
}
}


public class MethodOverloadingDemo {

	public static void main(String[] args) {
		 Addition a=new Addition();
		 a.add(11);
		 a.add(12, 13, 14);
		 a.add(12.12, 10.10);
		 a.add(12, 10.10);
		
	}

}
