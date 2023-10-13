public class Search
{
   public static boolean search(String[][] array, String value)
   {
      boolean found = false;
      for (int row = 0; row < array.length; row++)
      {
         for (int col = 0; col < array[0].length; col++)
         {
            if (array[row][col].equals(value))
                found = true;
         }
      }
      return found;
   }

   public static void main(String[] args)
   {
      ///int[][] matrix = { {3,2,3},{4,3,6},{8,9,3},{10,3,3} };
      ///System.out.println(search(matrix,10));
      ///System.out.println(search(matrix,11));

     // Comment out the code above, and try these:
     String[][] matrix2 = { {"a","b","c"},{"d","e","f"} };
     System.out.println(search(matrix2, "b"));

   }
}
