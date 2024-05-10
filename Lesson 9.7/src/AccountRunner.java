
public class AccountRunner {
    public static void main(String[] args)
    {
        Account acct1 = new Account("Armani Smith", 1500);
        System.out.println(acct1);
        SavingsAccount acct2 = new SavingsAccount("Dakota Jones",1500,4.5);
        System.out.println(acct2);
        SavingsAccount acct3 =new SavingsAccount("Mosj Jattingly",1500,45);
        System.out.println(acct3);
        System.out.println(acct2.equals(acct3));
    }
}
