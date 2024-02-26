public class ColumnMajorTraversal
{
  public static void main(String[] args)
   {
     int[][] array = { {1,2,3},{4,5,6}};
     for (int row = 0; row < array.length; row++)
     {
         for (int col = 0; col < array[row].length; col++)
         {
             System.out.println( array[row][col] );
         }
     }
   }
}