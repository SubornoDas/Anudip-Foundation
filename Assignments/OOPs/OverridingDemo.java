package OOPs;
//for overriding the child class method name should be the same as parent 
//method name
//the parameters passed in the method should also be the same
//there should be a IS-A relationship(parent/child relation)


class Rbi //parent class
{
public void loanInterest() {
	System.out.println("9% loan interest");
	
}	
}
class Sbi extends Rbi{	//child1 class
	public void loanInterest() {
		System.out.println("SBI: 5% loan Interest");
		
	}
}
class Hdfc extends Rbi{		//child 2 class
	public void loanInterest() {
		System.out.println("HDFC:8% loan Interest");
	}
}
public class OverridingDemo {
public static void main(String[] args) {
	Rbi rbi;
	rbi= new Sbi();
	rbi.loanInterest();

	rbi=new Hdfc();
	rbi.loanInterest();
}

}
