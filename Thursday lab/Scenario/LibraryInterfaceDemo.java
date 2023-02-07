package labthursday;
import java.util.Scanner;
interface LibraryUser{
	
	Scanner sc=new Scanner(System.in);
	void registerAccount();
	void requestBook();
	 
}
class KidUser implements LibraryUser{
	

	int age;
	String bookType;
	 
	
	@Override
	public void registerAccount() {
		 System.out.println("Enter your age:");
		 age=sc.nextInt();
		 if(age<12) {
		System.out.println("You have successfully registered under kids Account");	 
		 }
		 else {
			 System.out.println("Sorry, Age must be less than 12 to register as a kid");
		 }
		 }
		
	
	@Override
	public void requestBook() {
		 System.out.println("Enter your booktype:");
		 bookType=sc.nextLine();
		 if(bookType.equalsIgnoreCase("kids")) {
		System.out.println("Book Issued successfully,please return the book within 10 days");	 
		 }
		 else {
			System.out.println("Oops, you are allowed to take only kids books");
		}
		 }
		 class AdultUser implements LibraryUser{
			 int age;
				String bookType;
				 
			@Override
			public void registerAccount() {
				 System.out.println("Enter your age:");
				 age=sc.nextInt();
				 if(age>12) {
				System.out.println("You have successfully registered under an Adult Account");	 
				 }
				 else {
					 System.out.println("Sorry, Age must be greater than 12 to register as an Adult");
				 }
				 }

			@Override
			public void requestBook() {
				 System.out.println("Enter your booktype:");
				 bookType=sc.nextLine();
				 if(bookType.equalsIgnoreCase("adult")) {
				System.out.println("Book Issued successfully,please return the book within 7 days");	 
				 }
				 else {
					System.out.println("Oops, you are allowed to take only adult fiction books");
				}
				 }
				
			}
				
			public class LibraryInterfaceDemo{
				public static void main(String[] args) {
				//	Scanner sc=new Scanner(System.in);
					KidUser kids=new KidUser();
					do {
						System.out.println("");
						System.out.println("Which book do you want: \n 1)Kid \n 2)Adult");
						
					int choice=sc.nextInt();
					switch(choice) {
					case 1:
						System.out.println("1)Register 2)Borrow");
						int ch=sc.nextInt();
						switch(ch) {
						case 1: kids.registerAccount();
						break;
						case 2: 
							kids.requestBook();
							break;
						}
					}
					
					
					
					
					
					
					
					
					
					
					}while(true);
				}
			}
}
				
				
			

			 
			
			 
		 
		
	
	
