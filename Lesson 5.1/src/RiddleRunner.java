
public class RiddleRunner {
    public static void main(String[] args)
    {
        // call the Riddle constructor to create 2 new Riddle objects
        // with the arguments for the riddle question and answer.

        // call the riddle objects' printQuestion() and printAnswer methods
    	Riddle riddler = new Riddle("My dog's got no nose. How does he smell?", "Awful!");
    	Riddle riddler2 = new Riddle("What walks on 4 legs in the morning, two legs in the afternoon, and three legs in the evening?", "A human");
    	
    	riddler.printQuestion();
    	riddler.printAnswer();
    	
    	riddler2.printQuestion();
    	riddler2.printAnswer();
    }

}
