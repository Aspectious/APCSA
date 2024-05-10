
public class Account {
	private String name;
	private int money;
	
	public Account(String name, int money) {
		this.name = name;
		this.money = money;
	}
	
	public String toString() {
		return "Account: " + name.toUpperCase() + " --- Balance: " + money;
	}
	
}
