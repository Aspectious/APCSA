
public class Movie extends ItemForSale {
	private String title;
	private Author director;
	
	public Movie(String title, Author director, double price) {
		super(price);
		this.title = title;
		this.director = director;
	}
	
	public Author getAuthor() {return director;}
	public String getTitle() {return title;}
}
