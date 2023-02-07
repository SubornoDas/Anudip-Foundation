package OOPs;
class Student1{
	int id;
	String name,address;
	long phone;
	static String institute="Anudip Foundation";
	//default constructor or no-args constructor
	/* public Student1()
	{
		id=0;
		name=null;
	
	}*/
	// parameterized constructor
	public Student1(int id,String name,String address,long phone) {
		this.id=id;
		this.name=name;
		this.address=address;
		this.phone=phone;
	}
	public void Display()
	{
		System.out.println("ID:"+id);
		System.out.println("NAME:"+name);
		System.out.println("ADDRESS:"+address);
		System.out.println("MOBILE:"+phone);
		System.out.println("INSTITUTE:"+institute);
	}
 public static void changeInstituteName()
		 {
			 institute="Anudip Foundation For Social Welfare";
	
}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		Student1 student1=new Student1(101,"Suborno","Jharkhand",6200639596l);
		student1.Display();
		System.out.println();
		Student1.changeInstituteName();
		Student1 student2=new Student1(102,"Sonu","Ranchi",6200639599l);
		student2.Display();
		
		 

	}

}
