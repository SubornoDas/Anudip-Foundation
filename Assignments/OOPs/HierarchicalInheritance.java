package OOPs;
class ABCD{
	public void show() {
		System.out.println("<<<<------A to Z-------->>>>");
	}
}


class A extends ABCD{
	public void display() {
	
	System.out.println("A for Apple");
	}
	
	}
class B extends ABCD{
	public void display1() {
		System.out.println("B for Ball");
	}
}
class C extends ABCD{
	public void display2() {
		System.out.println("C for Cat");
		
	}
	
}
class D extends ABCD{
	public void display3() {
		System.out.println("D for Dog");
		
	}

	
}
public class HierarchicalInheritance {
public static void main(String[] args) {
	ABCD x=new ABCD();
	x.show();
	A obj1=new A();
	obj1.display(); 
	B obj2=new B();
	obj2.display1();
	 C obj3=new C();
	 obj3.display2();
	 D obj4=new D();
	 obj4.display3();
	
	
}
}
