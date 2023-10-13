public class AsciiArt
{
   public static void main(String[] args)
   {

      String[][] asciiArt = {
            {" ", " ", "_", "_", "_", " ", " "},
            {" ", "(", "o", " ", "o", ")", " "},
            {"(", " ", " ", "V", " ", " ", ")"},
            {" ", "-", "m", "-", "m", "-", " "},
       };

      //Part 1: Add 2 assignment statements to change "o" to "@"


      // print the asciiArt for Part 1
      System.out.println("ASCII Art:");
      for(String[] row : asciiArt) {
        for(String column : row)
          System.out.print(column);
        System.out.println();
      }

      //Part 2: Create your own ASCII art array and print it out!


   }
}
