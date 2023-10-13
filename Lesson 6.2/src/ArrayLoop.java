public class ArrayLoop
{

  // What does this method do?
   public static void multAll(int[] values, int amt)
   {
     for (int i = 0; i < values.length; i++)
     {
       values[i] = values[i] * amt;
     }
   }

   // What does this method do?
   public static void printValues(int[] values)
   {
     for (int i = 0; i < values.length; i++)
     {
        System.out.println(  values[i] );
     }
   }

   public static void main(String[] args)
   {
     int[] numArray =  {2, 6, 7, 12, 5};
     multAll(numArray, 2);
     printValues(numArray);
   }
}
