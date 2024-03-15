/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
		CelebrityGame game = new CelebrityGame();
		game.addCelebrity("Linus Sebastian", "Cool guy who does tech videos on yt", "Internet Celebrity");
		game.play();
	}
}
