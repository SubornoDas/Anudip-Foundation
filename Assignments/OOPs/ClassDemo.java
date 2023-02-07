package OOPs;

class Student {
	int id;
	String name,address;
	long phone;
	/*public void setData(int i,String n,String add,long ph)
	 {
	 id=i;
	 name=n
	 address=add;
	 phone=ph;
	 }*/
public void setData(int id,String name,String address,long phone ) {
	this.id=id;
	this.name=name;
	this.address=address;
	this.phone=phone;
}
public void getData()
{
	System.out.println("ID:"+id);
	System.out.println("NAME:"+name);
	System.out.println("ADDRESS:"+address);
	System.out.println("MOBILE:"+phone);
}

}
public class ClassDemo{
	public static void main(String[] args) {
		//create object/class instantiation
		Student student=new Student();
		//using instance of a class(not safe)
		/*student.id=101;
		 student.name="Suborno";
		 student.address="Kolkata";
		 student.phone=6200639596;
		 System.out.println(student.address);)
		
		 */
		student.setData(101, "Sonu", "KOlkata",6200639596l);
		student.getData();
		 

	}

}
