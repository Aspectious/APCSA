
public class SavingsAccount extends Account {
	private double interest;
	
	public SavingsAccount(String name, int money, double interest) {
		super(name,money);
		this.interest = interest;
	}
	
	public String toString() {
		return super.toString() + " --- Interest Rate: " + interest + "%";
	}
	
	public boolean equals(Object other) {
		if (other instanceof SavingsAccount) {
			SavingsAccount acct = (SavingsAccount)other;
			if (this.interest == acct.interest) return true;
			else return false;
		}
		else return false;

	}
}
