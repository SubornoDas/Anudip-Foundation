package basic;
import java.util.Scanner;
public class Transaction {
public static float deposit(float a,float b) {
	float result=a+b;
	 System.out.println("New balance"+result);
	return result;
}
public static float withdraw( float a,float b) {
	float c =0 ;
	if(a>b) {
	 c=a-b;
		System.out.println("remaining amount is:"+c);
	}
		else {
			System.out.println("Insufficient balance.Transaction failed!");
			
	}
return c;
}

	 
	 
	
	

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	 float bal,res,dep,with;
	 System.out.println("Which operation do you want to perform:");
	 System.out.println("1)Deposit 2)Withdrawal ");
	int choice=sc.nextInt();
	 switch(choice) {
	 case 1:
		 System.out.println("Enter your balance:");
		 bal=sc.nextFloat();
		 System.out.println("Enter deposit amount:");
		 dep=sc.nextFloat();
		 res=Transaction.deposit(bal,dep);
		
		 break;

	 case 2:
		 System.out.println("Enter your balance:");
		 bal=sc.nextFloat();
		 System.out.println("Enter withdrawal amount:");
		 with=sc.nextFloat();
		 res=Transaction.withdraw(bal,with);
		
}
	}
}
