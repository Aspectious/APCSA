import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		int ANSWER = (int)Math.round(Math.random()*101);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Welcome to the guessing game! Pick a number between 1-100 (Guess #1): ");
		String guessTEMP = scan.nextLine();
		int guess = Integer.parseInt(guessTEMP);
		int count = 1;
		while (guess != ANSWER) {
			count++;
			if (guess < ANSWER) {
				System.out.print("Too Low! Pick a number between 1-100 (Guess #"+count+"): ");
			} else if (guess > ANSWER) {
				System.out.print("Too High! Pick a number between 1-100 (Guess #"+count+"): ");
			}
			guessTEMP = scan.nextLine();
			guess = Integer.parseInt(guessTEMP);
		}
		System.out.println("You got it! You guessed [" + guess +"], and the answer was [" + ANSWER + "]! Guessed in [" + count +"] Guesses.");
	}
}