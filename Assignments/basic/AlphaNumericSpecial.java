package basic;
import java.util.Scanner;

public class AlphaNumericSpecial {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char ch = sc.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

             System.out.println(ch + " is A ALPHABET.");

        } else if(ch >= '0' && ch <= '9') {

             System.out.println(ch + " is A DIGIT.");

        } else {

             System.out.println(ch + " is A SPECIAL CHARACTER.");
        }
    
    }
}
