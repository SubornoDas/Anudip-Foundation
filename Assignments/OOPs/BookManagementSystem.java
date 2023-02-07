package OOPs;
import java.util.Scanner;
class Book{
		int bookId,price;
		String bookName,authorName,availability;
			static String library="Ranchi Library";
	
	public void createBook(int bookId,String bookName,int price,String authorName,String availability) {
		this.bookId=bookId;
		this.bookName=bookName;
		this.price=price;		
		this.authorName=authorName;		 
		this.availability=availability;
	}
public void display()
{
	System.out.println("BookID:"+bookId);
	System.out.println("BookNAME:"+bookName);
	System.out.println("PRICE:"+price);
	System.out.println("AUTHORNAME:"+authorName);
	System.out.println("Library Name:"+ library);
	System.out.println("Availability:"+ availability);
	
}
public void borrow() {
	if(availability==("available")||availability==("Available")) {
		System.out.println("The book is Available");
	}
	else {
		System.out.println(" The book is not Available");
	}
}
}

	public class BookManagementSystem {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book book1=new Book();
		book1.createBook(01,"Think like a monk",1000,"Jay Shetty","Available");
	 
		System.out.println();
		Book book2=new Book();

		book2.createBook(02,"The Power of Subconscious Mind", 500, "Joseph Murphy","Not Available" );
		System.out.println(); 
		Book book3=new Book();
		book3.createBook(03, "The Ramayana",  1000, "Valmiki","Available" );
		 
		do {
		System.out.println("Please choose an option");
		System.out.println("1)To check details\n2)To check availabilty\n 3) Exit");
		int choice=sc.nextInt();
		if(choice==1) {
	
			System.out.println("Enter which book to check details");
			System.out.println("1) "+book1.bookName+" "+"2) "+book2.bookName+" "+"3) "+book3.bookName);
			int ch=sc.nextInt();
			switch(ch) 
			{
			case 1:
				book1.display();
				break;
			case 2:
				book2.display();
				break;
				default:
					System.out.println("Wrong Input");
				case 3:
					book3.display();
					break;
			}	
			
		}
			
		
					else if(choice==2) {
					System.out.println("Enter which book to check availability");
					System.out.println("1) "+book1.bookName+" "+"2) "+book2.bookName+" " +"3) " +book3.bookName);
					int ch=sc.nextInt();
					switch(ch) {
					case 1:
						book1.display(); 
						book1.borrow();
						 break;
					case 2:
						book2.display();
						book2.borrow();
						break;
					case 3:
						book3.borrow();
						break;
					}
					
					}
					else if(choice==3) {
						System.exit(0);
						
					}
					else
						System.out.println("Wrong Input");
		}while(true);
			
					
	
		 
	}

}
 
