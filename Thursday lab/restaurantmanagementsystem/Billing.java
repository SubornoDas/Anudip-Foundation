package restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Billing {
	

static ArrayList<Bill> list =new ArrayList<Bill>();
static Scanner sc=new Scanner(System.in);
static void order(String fname,int amt)
{
System.out.println("Enter the quantity for "+fname+" :");
int qty=sc.nextInt();
list.add(new Bill(fname,qty, qty*amt));
}
 	static void cont() {
	System.out.println("Do you want to continue : y/n");
	char ch=sc.next().charAt(0);
	String discount;
	if((ch!='y'))
	{
		System.out.println();
		//print total bill
		totalbill();
		System.out.println("Have a promo code ? y/n");
		 ch=sc.next().charAt(0);
		if(ch=='y')
		{
			coupon();
		}
		else
		{
			totalbill();
		}
		System.exit(0);
	}
}
	
	static void totalbill()
	{
		System.out.println("BILL");
		System.out.println("=====================================");
		System.out.println(" ITEMS\t\t\tQty\tAMOUNT");
		System.out.println("=====================================");
		double total=0.0;
		for(Bill i:list) {
			System.out.println(i.fname+" \t"+i.qty+"\t"+i.amt);
			total=total+i.amt;
		}
		System.out.println();
		System.out.println("Amount :\tRs. "+total);
			System.out.println();
		double gst=total*0.05;
		System.out.println("GST:\tRs. "+gst);
		System.out.println("---------------------------");
		double famount=gst+total;
		System.out.println("Total :\tRs. "+famount);
		
		
	}
	 static void coupon() {
			
			String coup1="123456";
			String coup2="FIRST123";
			String coup3="NEW123";
			sc.nextLine();
			System.out.println("Enter the coupon code : ");
			String code=sc.next();
			if(code.equals(coup1)||(code.equals(coup2))||(code.equals(coup3)))
			{
				System.out.println("BILL");
				System.out.println("=====================================");
				System.out.println(" ITEMS\t\t\tQty\tAMOUNT");
				System.out.println("=====================================");
				double total=0.0;
				for(Bill i:list) {
					System.out.println(i.fname+" \t"+i.qty+"\t"+i.amt);
					total=total+i.amt;
				}
				System.out.println();
				System.out.println("Amount :\tRs. "+total);
				double gst=total*0.05;
				System.out.println("GST:\tRs. "+gst);			
				System.out.println("---------------------------");
				double famount=gst+total;
				System.out.println("Total :\tRs. "+famount);
					double dist=famount*0.1;
					System.out.println("Discount : Rs. "+dist);
					System.out.println("Total after discount:Rs. "+(famount-dist));
					System.out.println();
					System.out.println("Thanks for visiting us !!!");
					System.exit(0);
			}
		}	
}
	
	




