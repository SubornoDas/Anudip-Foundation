package OOPs;
class Company{
	int compId;
	String compName;
	Address address;	//entity reference
	public Company(int compId, String compName, Address address) {
		super();
		this.compId = compId;
		this.compName = compName;
		this.address = address;
	}
	public int getCompId() {
		return compId;
	}
	public String getCompName() {
		return compName;
	}
	public Address getAddress() {
		return address;
	}
	
}
public class AggregationDemo{
	public static void main(String[] args) {
		Address address1=new Address(1001,"Ranchi","Jharkhand","India");
		Address address2=new Address(1002,"New York City","New York","USA");
		
		Company company1=new Company(121,"Anudip Foundation",address1);
		Company company2=new Company(111,"Anudip Foundation",address2);
		
		System.out.println("First Company:"+company1.getCompName());
		System.out.println("Address:"+company1.getAddress().getCity());
		
		System.out.println();
		
		System.out.println("Second Company:"+company2.getCompName());
		System.out.println("Address:"+company2.getAddress().getCity());
		
	}
}
