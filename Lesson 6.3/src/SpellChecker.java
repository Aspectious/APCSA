import java.io.*;
import java.util.*;

public class SpellChecker
   {
      private String[] dictionary = new String[127143];
      
      // WRITE Your Methods HERE!





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