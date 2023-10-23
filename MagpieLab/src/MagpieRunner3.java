import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner3
{

	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	
	public static void main(String[] args)
	{
		Magpie3 maggie = new Magpie3();
		Scanner in = new Scanner(System.in);

		// findKeworld Calls
		
		
		
		System.out.println (maggie.getGreeting());
		String statement = in.nextLine();
		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
		
	}

}
