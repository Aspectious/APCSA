public class Total
{

   public static int getTotalForRow(int row, int[][] a)
   {
      int total = 0;
      for (int col = 0; col < a[0].length; col++)
      {
         total = total + a[row][col];
      }
      return total;
   }

   // Complete the method getTotalForCol below
   public static int getTotalForCol(int col, int[][] a)
   {
       int total = 0;
       for(int row = 0; row< a.length; row++){
           total += a[row][col];
       }
       return total;
   }

   public static void main(String[] args)
   {
      int[][] matrix = {  {1,2,3},{4,5,6}};
      System.out.println(getTotalForRow(0,matrix));
      System.out.println(getTotalForCol(0,matrix));
   }
}
