package bookmanagement;

import java.util.Scanner;

public class BookMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		BookService bService=new BookService();
		int ch;
		do {
			System.out.println("Welcome to Book Management System");
			System.out.println("1) Create Book Details\n"+"2) Get Book Details Using ID\n"+"3) Get All Book Details\n"+"4) Get Book Details Using Book Name\n"+"5)Exit");
			System.out.println("================================");
			System.out.println("Enter the choice:");
			 ch=sc.nextInt();
			switch(ch) {
			case 1: 
				bService.createBook();
				System.out.println();
				break;
			case 2:
				bService.getBookDetailsUsingId();
				System.out.println();
				break;
			case 3:
				bService.getAllBookDetails();
				System.out.println();
				break;
			case 4:
				bService.getBookDetailsUsingName();
				System.out.println();
				break;
			case 5:
				System.out.println("Thank you for visiting!!!");
				System.exit(0);
				default:
					System.out.println("Wrong Input");
			}
			
		}while(true);

	}

}
