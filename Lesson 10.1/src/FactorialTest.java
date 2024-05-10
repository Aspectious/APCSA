public class FactorialTest
{

	static int r = 1;
    public static int factorial(int n)
    {
    	System.out.println(r);
        r++;
        if (n == 0) return 1;
        else return n * factorial(n - 1);
        
    }
    public static String pri(int n) {
    	return "factorial of " + n + " is: " + factorial(n);
    }
    public static void main(String[] args)
    {
    	System.out.println(pri(-1));
    }
}