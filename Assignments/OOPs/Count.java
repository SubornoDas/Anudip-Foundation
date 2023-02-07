package OOPs;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num,i,temp=0;
		System.out.println("Enter the number:");
		num=sc.nextInt();
		temp=num;
		System.out.println("Using for loop");
		
		//for(i=0;num!=0;i++) {
		//	num=num/10;
		//}
			//System.out.println("The number of digits in"+temp+"is:"+i);
			//System.out.println();
			//System.out.println("Using while loop");
			int count=0;
			while(num!=0) {
				num=num/10;
				count++;
			}
			System.out.println("No of digits in "+temp+"is "+count);
			
			
		}
		 
	}


