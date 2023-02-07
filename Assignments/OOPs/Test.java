package OOPs;

public class Test {
	public static void main(String[] args) {
		StudentNew student1=new StudentNew();
		student1.setId(101);
		student1.setFirstName("Suborno");
		student1.setLastName("Das");
		student1.setAddress("Address");
		System.out.println(student1.getId());
		System.out.println(student1.getFirstName());
		System.out.println(student1.getLastName());
		System.out.println(student1.getAddress());
		
		System.out.println();
		
		StudentNew student2=new StudentNew();
		student2.setId(202);
		student2.setFirstName("Sonu");
		student2.setLastName("Das");
		student2.setAddress("Jharkhand");
		System.out.println("ID="+student2.getId());
		System.out.println("FIRSTNAME="+student2.getFirstName());
		System.out.println("LASTNAME="+student2.getLastName());
		System.out.println("ADDRESS="+student2.getAddress());
		
	
	
	
	}
	

}
