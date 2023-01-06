package basic;
import java.util.Scanner;

/**
 * @author ASUS
 *
 */
public class Divisible {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		if(num%5==0 && num%11==0)
		{
			System.out.println("The number is divisible by both 5 and 11");
		}
		else {
			System.out.println("The number is not divisible by 5 and 11");
		}
		

	}

}
