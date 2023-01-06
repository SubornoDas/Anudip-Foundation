package bookmanagement;

import java.util.Scanner;

public class BookService {

	static Book book[] =new Book[10];
	static Scanner sc=new Scanner(System.in);
	 static int index=0;
	
	 //create book method
	 
	public static void createBook() {
		
		System.out.println("Enter book id");
		int id =sc.nextInt();
		
		sc.nextLine();		// it will consume the next line
		
		System.out.println("Enter book name");
		String bname=sc.nextLine();
		
		sc.nextLine();
		
		System.out.println("Enter authors name");
		String author=sc.nextLine();
		
		System.out.println("Enter book price");
		double price=sc.nextDouble();
		
		 
		book[index]=new Book(id,bname,author,price);
		index++;
		System.out.println("Book details added!!");
	}
	// get all book details
	public static void getAllBookDetails() {
		for(int i=0;i<index;i++){
			System.out.println("Book ID:"+book[i].getBookId());
			System.out.println("Book Name:"+book[i].getBookName());
			System.out.println("Book Author Name:"+book[i].getAuthorName());
			System.out.println("Book Price:"+book[i].getBookPrice());
			System.out.println("=========================================");
			
		}
	}
		//get book details using id
	public static void getBookDetailsUsingId() {
		boolean flag=false;
		System.out.println("Enter Book Id to search:");
		int id=sc.nextInt();
		for(int i=0;i<index;i++) {
			if(id==book[i].getBookId()) {
				System.out.println("Book Id:"+book[i].getBookId());
				System.out.println("Book Name:"+book[i].getBookName());
				System.out.println("Book Author Name:"+book[i].getAuthorName());
				System.out.println("Book Price:"+book[i].getBookPrice());
				System.out.println("=======================================");
				flag=true;
				break;
			
			}
			
		}
		
		if(flag==false) {
			System.out.println("Book not Found");
		}	}
		// get book details using book name
		public static void getBookDetailsUsingName() {
			boolean flag=false;
			sc.nextLine();
			System.out.println("Enter Book Name to Search:");
			String bname=sc.nextLine();
			for(int i=0;i<index;i++) {
				if(bname.equalsIgnoreCase(book[i].getBookName())) {
					System.out.println("Book Id:"+book[i].getBookId());
					System.out.println("Book Name:"+book[i].getBookName());
					System.out.println("Book Author Name:"+book[i].getAuthorName());
					System.out.println("Book Price:"+book[i].getBookPrice());
					System.out.println("=======================================");
					flag=true;
					break;
				}
			}
		
			
			if(flag==false) {
				System.out.println("Invalid Name");
			}
		
	}

}
