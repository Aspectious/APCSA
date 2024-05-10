
public class Book extends ItemForSale {
	private String title;
	private Author author;
	
	public Book(String title, Author author, double price) {
		super(price);
		this.title = title;
		this.author = author;
	}
	
	public Author getAuthor() {return author;}
	public String getTitle() {return title;}
}
