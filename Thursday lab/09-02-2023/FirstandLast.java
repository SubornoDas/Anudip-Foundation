package newassignment;

import java.util.Scanner;

public class FirstandLast {
	public static void main(String[] args) {
		int n,firstDigit = 0,lastDigit,temp=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number : ");
		n=sc.nextInt();
		temp=n;
		lastDigit=n%10;
		System.out.println("The last digit of "+temp+" is "+lastDigit);
		while(n>=10) {
			n=n/10;
			firstDigit=n;
		}
		System.out.println("The first digit of "+temp+" is "+firstDigit);
		}
	}


