package bookmanagement;

public class Book {

	private int bookId;
	private String bookName;
	private String authorName;
	private double bookPrice;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getBookPrice() {
		return  bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Book(int bookId, String bookName, String authorName, double price) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookPrice = price;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
