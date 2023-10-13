import java.util.*;
import java.io.*;

class SpellCheckerRunner {
  public static void main(String[] args) throws IOException {
    SpellChecker checker = new SpellChecker();
    // uncomment to test
    //checker.print10();
    
    System.out.print("Enter a word to spell check or q to quit: ");
    Scanner scan = new Scanner(System.in);
    String word = scan.nextLine();
    /* Uncomment to test 
    while (!word.equals("q")) {
      if (checker.spellcheck(word) == true)
        System.out.println(word + " is spelled correctly!");
      else
        System.out.println(word + " is misspelled!");

      System.out.print("Enter a word to spell check or q to quit: ");
      word = scan.nextLine();
      }    
    */
    scan.close();
  }
}