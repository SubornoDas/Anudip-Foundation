package basic;
import java.util.Scanner;
public class Calculator {
	public static int addition(int a,int b) {
	int result =a+b;
	return result;
	}
	public static int subtraction(int a,int b)
	{
		int c;
		if(a>b)
		{
			c=a-b;
		}
			else {
				c=b-a;
			}
			return c;
			}
	public static float division(float a,float b)
	{
		float d;
		if(a>b) {
			d=a/b;
		}
		else {
			d=b/a;
			
		}
		return d;
		
	}
	public static int mul(int a,int b) {
		int c=a*b;
		return c;
	}
	
	public static void main(String[] args) {
		  
	 int choice,num1,num2,res;
	 float num3,num4,res1;
	 Scanner sc=new Scanner(System.in);
	 do {
	 System.out.println("Which operation do you want to perform:");
	 System.out.println("1)Addition 2)Subtraction 3)Division 4)Multiplication 5)Exit");
	 choice=sc.nextInt();
	 switch(choice) {
 
	 case 1:
		 System.out.println("Enter the first digit:");
		 num1=sc.nextInt();
		 System.out.println("Enter the second digit:");
		 num2=sc.nextInt();
		 res=Calculator.addition(num1,num2);
		 System.out.println(num1+"+"+num2+"="+res);
		 break;
	 case 2:
		 System.out.println("Enter the first digit:");
		 num1=sc.nextInt();
		 System.out.println("Enter the second digit:");
		 num2=sc.nextInt();
		 res=Calculator.subtraction(num1, num2);
		 System.out.println(num1+"-"+num2+"="+res);
		 break;
	 case 3:
		 System.out.println("Enter the first digit:");
		 num3=sc.nextFloat();
		 System.out.println("Enter the second digit:");
		 num4=sc.nextFloat();
		 res1=Calculator.division(num3,num4);
		 System.out.println(num3+"/"+num4+"="+res1);
		 break;
	 case 4:
		 System.out.println("Enter the first digit:");
		 num1=sc.nextInt();
		 System.out.println("Enter the second digit:");
		 num2=sc.nextInt();
		 res=Calculator.mul(num1,num2);
		 System.out.println(num1+"*"+num2+"="+res);
		 break;
	 
	 
	 
	 case 5:
		 System.out.println("The program will be terminated");
		
		 System.exit(0);
	 }
	}while(choice!=5);
}
}
