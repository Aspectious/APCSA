import java.io.*;
import java.util.*;

public class SpellChecker
   {
      private String[] dictionary = new String[127143];
      
      // WRITE Your Methods HERE!
      // Checks spelling for words
      public boolean spellcheck(String word) {
    	  for (String w:dictionary) {
    		  if (w.equals(word)) return true;
    	  }
    	  return false;
      }
      
      // Prints out all possible words that start with the query
      public void printStartsWith(String query) {
    	  for (String w:dictionary) {
    		  if (w.startsWith(query)) System.out.println(w);
    	  }
      }



      public SpellChecker() throws IOException {
 
        // create File object
        File dictionaryFile = new File("dictionary.txt");
     
        //Create Scanner object to read File
        Scanner scan = new Scanner(dictionaryFile);
     
        // Reading each line of the file
        // and saving it in the array
        int i = 0;
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            dictionary[i] = line;
            i++;
        }
        scan.close();
    }  
        
      
     
   }