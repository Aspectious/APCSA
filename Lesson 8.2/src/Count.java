
public class Count
{
   public static int countValues(int value, int[][] a,
                              int rowStart, int rowEnd,
                              int colStart, int colEnd)
   {
      int count = 0;
      for (int row = rowStart; row <= rowEnd; row++)
      {
         for (int col = colStart; col <= colEnd; col++)
         {
            if (a[row][col] == value)
               count++;
         }
      }
      return count;
   }

   public static void main(String[] args)
   {
      int[][] matrix = {  {3,2,3},{4,3,6},{8,9,3},{10,3,3}};
      System.out.println(countValues(3,matrix,0,2,0,2));
   }
}
