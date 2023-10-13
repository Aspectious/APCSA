
public class StringFindRunner {
	  /** findLetter looks for a letter in a String
	   * @param String letter to look for
	   * @param String text to look in
	   * @return boolean true if letter is in text
	   * After running the code, change this method to return
	   * an int count of how many times letter is in the text.
	   */
	   public boolean findLetter(String letter, String text)
	   {
	       boolean flag = false;
	       for(int i=0; i < text.length(); i++)
	       {
	           if (text.substring(i, i+1).equalsIgnoreCase(letter))
	           {
	              flag = true;
	           }
	       }
	       return flag;
	    }
}
