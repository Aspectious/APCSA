public class BankAccount {
	// Private instance variables
	private String accountHolderName;
	private long accountNumber;
	private double accountBalance;
	
	
	// Constructors
	// Initializes defaults if no parameters defined
	public BankAccount() {
		this.accountHolderName = "undefined";
		this.accountNumber = 12345678910l;
		this.accountBalance = 0.0d;
	}
	// Initializes the object.
	public BankAccount(String accountHolderName, long accountNumber) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountBalance = 0.0d;
	}
	
	
	// toString Method, parses it in a readable format.
	public String toString() {
		return 	"--- Bank Account ---" + "\n" + 
				"Account Number: 	" + this.accountNumber + "\n" +
				"Account Holder:  	" + this.accountHolderName + "\n" +
				"Account Balance:	" + this.accountBalance);
				
	}
	
	// Methods for withdraws/deposits
	public void withdraw(double amount) {
		if ((this.accountBalance >= 0) && (this.accountBalance - amount >= 0)) {
			this.accountBalance -= amount;
		} else return;
		// TODO: Flag as an event and send it to the user
	}
	public void deposit(double amount ) {
		this.accountBalance += amount;
	}
	
	
	
	
	// main method
	public static void main(String[] args) {
		BankAccount act1 = new BankAccount();
		BankAccount act2 = new BankAccount("Jeremy", 998306736);
		BankAccount act3 = new BankAccount("Sarah", 924323007);
		
		System.out.println(act1);
		act2.deposit(100000000.00d);
		act2.withdraw(8642354.32);
		act3.deposit(5724879245744.0d);
		act3.withdraw(47582374823.32d);
		System.out.println(act2);
		System.out.println(act3);
		
	}
}