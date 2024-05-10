import java.util.*;

public class Store {
    // instance variable (could be an array or ArrayList of one of the classes above)
	ArrayList<ItemForSale> items = new ArrayList<ItemForSale>();
	public Store(ItemForSale[] items) {
		for (ItemForSale item: items) {
			this.items.add(item);
		}
	}
    public static void main(String[] args)
    {
       Store s = new Store(new ItemForSale[] {new Book("Educated",new Author("Tara Westover"), 19.99d),new Movie("Dying",new Author("Steven Speilberg"),39.99d)});
       Book b = new Book("Educated",new Author("Tara Westover"), 19.99d);
       System.out.println(b instanceof ItemForSale);
    }
}
