import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Class that contains helper methods for the Review Lab
 u**/
public class Review {
  
  private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
  private static ArrayList<String> posAdjectives = new ArrayList<String>();
  private static ArrayList<String> negAdjectives = new ArrayList<String>();
  
  private static final String SPACE = " ";
  
  static{
    try {
      Scanner input = new Scanner(new File("cleanSentiment.csv"));
      while(input.hasNextLine()){
        String[] temp = input.nextLine().split(",");
        sentiment.put(temp[0],Double.parseDouble(temp[1]));
        //System.out.println("added "+ temp[0]+", "+temp[1]);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing cleanSentiment.csv");
    }
    
    //read in the positive adjectives in postiveAdjectives.txt
    try {
      Scanner input = new Scanner(new File("positiveAdjectives.txt"));
      while(input.hasNextLine()){
        String temp = input.nextLine().trim();
        //System.out.println(temp);
        posAdjectives.add(temp);
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing postitiveAdjectives.txt\n" + e);
    }   
    
    //read in the negative adjectives in negativeAdjectives.txt
    try {
      Scanner input = new Scanner(new File("negativeAdjectives.txt"));
      while(input.hasNextLine()){
        negAdjectives.add(input.nextLine().trim());
      }
      input.close();
    }
    catch(Exception e){
      System.out.println("Error reading or parsing negativeAdjectives.txt");
    }   
  }
  
  
  /** 
   * Method to return a string containing all of the text in fileName (including punctuation), 
   * with words separated by a single space 
   * @param fileName - the name of the file containing the text to return
   */
  public static String textToString( String fileName )
  {  
    String temp = "";
    try {
      Scanner input = new Scanner(new File(fileName));
      
      //add 'words' in the file to the string, separated by a single space
      while(input.hasNext()){
        temp = temp + input.next() + " ";
      }
      input.close();
      
    }
    catch(Exception e){
      System.out.println("Unable to locate " + fileName);
    }
    //make sure to remove any additional space that may have been added at the end of the string.
    return temp.trim();
  }
  
  /**
   * Method that returns the sentiment value of word as a number between 
   * -4 (very negative) to 3 (very positive sentiment)
   * 
   * @param word - the word whose sentiment value is being determined
   * @return - the sentiment value of word
   */
  public static double sentimentVal( String word )
  {
    try
    {
      return sentiment.get(word.toLowerCase());
    }
    catch(Exception e)
    {
      return 0;
    }
  }
  
  /**
   * Returns the ending punctuation of a string, or the empty string if there is none 
   */
  public static String getPunctuation( String word )
  { 
    String punc = "";
    for(int i=word.length()-1; i >= 0; i--){
      if(!Character.isLetterOrDigit(word.charAt(i))){
        punc = punc + word.charAt(i);
      } else {
        return punc;
      }
    }
    return punc;
  }
  
  /**
   * Returns the word after removing any beginning or ending punctuation
   */
  public static String removePunctuation( String word )
  {
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(0)))
    {
      word = word.substring(1);
    }
    while(word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length()-1)))
    {
      word = word.substring(0, word.length()-1);
    }
    
    return word;
  }
  
  /** 
   * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
   */
  public static String randomPositiveAdj()
  {
    int index = (int)(Math.random() * posAdjectives.size());
    return posAdjectives.get(index);
  }
  
  /** 
   * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
   */
  public static String randomNegativeAdj()
  {
    int index = (int)(Math.random() * negAdjectives.size());
    return negAdjectives.get(index);
    
  }
  
  /** 
   * Randomly picks a positive or negative adjective and returns it.
   * @return a random adjective found in either 
   * randomNegativeAdjectives.txt or randomPositiveAdjectives.txt
   */
  public static String randomAdjective()
  {
    boolean positive = Math.random() < .5;
    if(positive){
      return randomPositiveAdj();
    } else {
      return randomNegativeAdj();
    }
  }
  
  public static void main(String args[]) {
	  String file = "SimpleReview.txt";
	  //double val = totalSentiment(file);
	  //System.out.println(val);
	  System.out.println(fakeReview(file));
  }

  public static double totalSentiment(String fileName) {
	  String format = textToString(fileName).toLowerCase().replaceAll("[^a-zA-Z0-9_'\n]"," ");
	  double sentiment = 0;
	  int wordstartindex = 0;
	  for (int i=1; i<format.length(); i++) {
		  if(format.substring(i-1, i).equals(" ")) {
			  String word = format.substring(wordstartindex,i-1);
			  double tempsentiment = sentimentVal(word);
			  System.out.println(tempsentiment + "	" + word);
			  sentiment += tempsentiment;
			  wordstartindex = i;
		  }
	  }
	  return sentiment;
  }
  
  
  public static int starRating(String fileName) {
	  double sentiment = totalSentiment(fileName);
	  int stars= 0;
	  if (sentiment <= 0) stars = 1;
	  else if (sentiment <= 10) stars = 2;
	  else if (sentiment <= 20) stars = 3;
	  else if (sentiment <= 30) stars = 4;
	  else if (sentiment > 30) stars = 5;
	  return stars;
  }
  public static String fakeReview(String filename) {
	  String format = textToString(filename).toLowerCase().replaceAll("[^a-zA-Z0-9_*]"," ");
	  int wordstartindex = 0;
	  String finale = "";
	  for (int i=1; i<format.length(); i++) {
		  if(format.substring(i-1, i).equals(" ")) {
			  String word = format.substring(wordstartindex,i-1);
			  if (word.startsWith("*")) {
				  word = randomAdjective().toUpperCase();
			  }
			  finale += word + " ";
			  wordstartindex = i;
		  }
	  }
	  return finale;
  }
}
  
  
