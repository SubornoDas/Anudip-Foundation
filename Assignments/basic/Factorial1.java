package basic;

//Java Program to find the Factorial of a Number
import java.util.*;
public class Factorial1
{
   public static void main(String []args)
   {
      //Take input from the user
      //Create an instance of the Scanner Class
      Scanner sc=new Scanner(System.in);
      //Declare and Initialize the variable
      System.out.println("Enter the number: ");
      int num=sc.nextInt();
      int i=1,fact=1;
      for(i=1;i<=num;i++)
      {
          fact=fact*i;
       
      }
      System.out.println("Factorial of the number: "+fact);  
   }   
}
