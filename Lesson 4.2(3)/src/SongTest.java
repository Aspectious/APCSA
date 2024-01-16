
public class SongTest
{

   public static void printPopSong(int startingInt)
   {
      String line1 = " bottles of beer on the wall";
      String line2 = " bottles of beer";
      String line3 = "Take one down and pass it around";

      // loop 5 times (5, 4, 3, 2, 1)
      for (int i=startingInt; i>=1;i--)
      {
         System.out.println(i + line1);
         System.out.println(i + line2);
         System.out.println(line3);
         System.out.println((i - 1) + line1);
         System.out.println();
      }
   }

   public static void main(String[] args)
   {
	   printPopSong(Integer.MAX_VALUE/100);
   }
}