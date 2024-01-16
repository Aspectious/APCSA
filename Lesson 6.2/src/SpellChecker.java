import java.io.*;
import java.util.*;

public class SpellChecker
   {
      private String[] dictionary = new String[127143];
      
      // WRITE Your Methods HERE!'
      public void print10() {
    	  for (int i=0; i<10; i++) {
    		  System.out.println(dictionary[i]);
    	  }
      }
      
      public boolean spellcheck(String word) {
    	  for (int i=0; i<dictionary.length; i++) {
    		  if (dictionary[i].equals(word)) return true;
    	  }
    	  return false;
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