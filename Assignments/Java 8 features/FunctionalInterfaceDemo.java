package java8features;

@FunctionalInterface
interface message{
	void say() ;
		default void msg() {
			
		System.out.println("Default with method body");
	}
default void talk()
{
	System.out.println("Second default method");
}
int hashCode();
String toString();
boolean equals(Object obj);


public class FunctionalInterfaceDemo implements message{

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.println("Saying I am Back");
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
FunctionalInterfaceDemo demo=new FunctionalInterfaceDemo() ;
demo.msg();
demo.say();
demo.talk();
	}
}
}
	
// FunctionalInterface - an interface that contains exactly one abstract method is known as functional interface.
// It can have any number of default ,static method but can contain only one abstract method.
// It can also declare method of object class	.
// it is also knwn as Single Abstract Method interface or SAM Interface .
