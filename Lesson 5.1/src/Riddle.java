public class Riddle
{
    // write 2 instance variables for Riddle's question and answer: private type variableName;
	private String Question;
	private String Answer;

    // constructor
    public Riddle(String initQuestion, String initAnswer)
    {
        // set the instance variables to the init parameter variables
    	this.Question = initQuestion;
    	this.Answer = initAnswer;
    }

    // Print riddle question
    public void printQuestion()
    {
        // print out the riddle question with System.out.println
    	System.out.println(Question);

    }

    // Print riddle answer
    public void printAnswer()
    {
        // print out the riddle answer with System.out.println
    	System.out.println(Answer);
    }



}

